package com.hospital.management.util;

import com.hospital.management.model.AbstractEntity;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;

public class CustomUUID extends UUIDGenerator
{

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException
    {
        if (object instanceof AbstractEntity)
        {
            AbstractEntity abstractEntity = (AbstractEntity) object;
            if (abstractEntity.getId() != null)
            {
                return abstractEntity.getId();
            }
        }
        Serializable id = super.generate(session, object);
        return id.toString();
    }
}

