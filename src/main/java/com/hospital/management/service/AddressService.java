package com.hospital.management.service;

import com.hospital.management.model.Address;

public interface AddressService {

    public Address findById(String id);

    public  boolean delete(String id);

    public  Address  save(Address address);
}
