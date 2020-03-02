package com.hospital.management.dto;

import com.hospital.management.model.Person;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Address Data Transfer Object")
public class AddressDto {

    @ApiModelProperty(required = true, value = "country")
    private String country;

    @ApiModelProperty(required = true, value = "city")
    private String city;

    @ApiModelProperty(required = true, value = "district")
    private String district;

    @ApiModelProperty(required = true, value = "street")
    private String street;

    @ApiModelProperty(required = true, value = "doorNo")
    private String doorNo;

    @ApiModelProperty(required = true, value = "postalAddress")
    private Integer postalAddress;

    @ApiModelProperty(required = true, value = "person")
    private Person person;

}

