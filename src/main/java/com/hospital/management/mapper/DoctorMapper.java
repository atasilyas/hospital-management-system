package com.hospital.management.mapper;

import com.hospital.management.dto.DoctorDto;
import com.hospital.management.model.Doctor;
import lombok.Data;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = { ReceiptMapper.class })
public interface DoctorMapper {

    DoctorMapper MAPPER = Mappers.getMapper(DoctorMapper.class);

    @Mappings({ @Mapping(source = "department", target = "department"),
                @Mapping(source = "graduatedUniversite", target = "graduatedUniversite"),
                @Mapping(source = "expertiesLevel", target = "expertiesLevel"),
                @Mapping(source = "receiptList", target = "receiptList"),
                @Mapping(source = "patientList", target = "patientList")})
    Doctor toDoctor(DoctorDto doctorDto);

    @InheritInverseConfiguration
    DoctorDto fromDoctor(Doctor doctor);
}
