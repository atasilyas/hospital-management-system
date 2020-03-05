package com.hospital.management.mapper.commonMapperBeans;

import com.hospital.management.dto.AddressDto;
import com.hospital.management.dto.DoctorDto;
import com.hospital.management.dto.PatientDto;
import com.hospital.management.mapper.AddressMapper;
import com.hospital.management.mapper.DoctorMapper;
import com.hospital.management.mapper.PatientMapper;
import com.hospital.management.model.Address;
import com.hospital.management.model.Doctor;
import com.hospital.management.model.Patient;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import javax.print.Doc;

/**
 * Created by kadirsen on 5.03.2020.
 */
@Component
public class MapperBeans
{


    AddressMapper MAPPERADDRESS = Mappers.getMapper(AddressMapper.class);
    DoctorMapper MAPPERDOCTOR = Mappers.getMapper(DoctorMapper.class);
    PatientMapper MAPPERPATIENT = Mappers.getMapper(PatientMapper.class);


    public Address toAddress(AddressDto addressDto)
    {

        return MAPPERADDRESS.toAddress(addressDto);
    }

    public AddressDto fromAddress(Address address)
    {
        return MAPPERADDRESS.fromAddres(address);
    }

    public Doctor toDoctor(DoctorDto doctorDto)
    {
        return MAPPERDOCTOR.toDoctor(doctorDto);
    }

    public DoctorDto fromDoctor(Doctor doctor)
    {
        return MAPPERDOCTOR.fromDoctor(doctor);
    }

    public Patient toPatient(PatientDto patientDto)
    {
       return MAPPERPATIENT.toPatient(patientDto);
    }

    public PatientDto fromPatient(Patient patient)
    {
        return MAPPERPATIENT.fromPatient(patient);
    }

}
