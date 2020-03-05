package com.hospital.management.dto;

import com.hospital.management.model.Person;
import lombok.Data;

import javax.persistence.*;

@Data
public class AddressDto {

    private String country;
    private String city;
    private String district;
    private String street;
    private String doorNo;
    private Integer postalAddress;
    private Person person;

}
