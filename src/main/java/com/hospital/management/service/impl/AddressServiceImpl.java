package com.hospital.management.service.impl;

import com.hospital.management.model.Address;
import com.hospital.management.repository.AddressRepository;
import com.hospital.management.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address findById(String id) {

        return addressRepository.getOne(id);
    }

    @Override
    public boolean delete(String id) {

        addressRepository.deleteById(id);
        return true;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, noRollbackFor = Exception.class)
    public Address save(Address address) {

        return addressRepository.save(address);
    }
}
