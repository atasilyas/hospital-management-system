package com.hospital.management.mapper;

import com.hospital.management.dto.DoctorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class DoctorCloner {

    DoctorCloner MAPPER= Mappers.getMapper(DoctorCloner.class);

}
