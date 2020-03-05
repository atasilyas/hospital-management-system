package com.hospital.management.dto;

import com.hospital.management.model.Doctor;
import lombok.Data;

import java.util.List;

@Data
public class PatientDto {


    private String sickType;
    private String height;
    private String weight;
    private Integer emergencyLevel;
    private List<Doctor> doctorList;
}
