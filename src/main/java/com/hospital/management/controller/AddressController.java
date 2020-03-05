package com.hospital.management.controller;

import com.hospital.management.dto.AddressDto;
import com.hospital.management.mapper.DoctorMapper;
import com.hospital.management.model.Address;
import com.hospital.management.model.Doctor;
import com.hospital.management.service.AddressService;
import com.hospital.management.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = ApiPaths.AddressPath.CTRL)
@Api(value = ApiPaths.AddressPath.CTRL, description = "Address APIs", produces = "Json", consumes = "Json" ,protocols = "HTTP")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "getAddress Operation", response = AddressDto.class)
    public ResponseEntity<AddressDto> getAddress(@PathVariable(value = "id",required = true) String id)
    {
        return  ResponseEntity.ok(addressService.findById(id));
    }

    @PostMapping("/create")
    @ApiOperation(value = "createAddress Operation", response = Address.class)
    public ResponseEntity<Address> createAddress(@Valid  @RequestBody(required = true) Address address)
    {
        return  ResponseEntity.ok(addressService.save(address));
    }

    @PutMapping("/update")
    @ApiOperation(value = "updateAddress Operation", response = Address.class)
    public ResponseEntity<Address> updateAddress(@RequestBody(required = true) Address address)
    {
        return  ResponseEntity.ok(addressService.save(address));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteAddress Operation", response = Boolean.class)
    public ResponseEntity<Boolean> deleteAddress(@PathVariable(value = "id",required = true) String id)
    {
        return  ResponseEntity.ok(addressService.delete(id));
    }

}
