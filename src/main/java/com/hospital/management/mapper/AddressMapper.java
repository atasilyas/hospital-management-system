package com.hospital.management.mapper;

import com.hospital.management.dto.AddressDto;
import com.hospital.management.dto.DoctorDto;
import com.hospital.management.model.Address;
import com.hospital.management.model.Doctor;
import com.hospital.management.service.AddressService;
import com.hospital.management.service.impl.AddressServiceImpl;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring",uses = { ReceiptMapper.class})
public interface AddressMapper
{

    AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

    /*@Mappings({ @Mapping(source = "department", target = "department"),
                @Mapping(source = "graduatedUniversite", target = "graduatedUniversite"),
                @Mapping(source = "expertiesLevel", target = "expertiesLevel"),
                @Mapping(source = "receiptList", target = "receiptList"),
                @Mapping(source = "patientList", target = "patientList")})*/
    Address toAddress(AddressDto addressDto);

    //@InheritInverseConfiguration
    AddressDto fromAddres(Address address);
}
