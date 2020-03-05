package com.hospital.management.mapper;

import com.hospital.management.dto.PatientDto;
import com.hospital.management.model.Patient;
import lombok.Data;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = { DoctorMapper.class })
public interface PatientMapper {

    PatientMapper MAPPER = Mappers.getMapper(PatientMapper.class);

    @Mappings({@Mapping(source = "sickType", target = "sickType" ),
            @Mapping(source = "height", target = "height"),
            @Mapping(source = "weight", target = "weight"),
            @Mapping(source = "emergencyLevel", target = "emergencyLevel"),
            @Mapping(source = "doctorList", target = "doctorList")})
    Patient toPatient(PatientDto patientDto);

    @InheritInverseConfiguration
    PatientDto fromPatient(Patient patient);
}


