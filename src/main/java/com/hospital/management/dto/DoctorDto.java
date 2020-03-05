package com.hospital.management.dto;

import com.hospital.management.model.Department;
import com.hospital.management.model.Patient;
import com.hospital.management.model.Person;
import com.hospital.management.model.Receipt;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class DoctorDto {


    private Department department;
    private String graduatedUniversite;
    private String expertiesLevel;
    private List<Receipt> receiptList;
    private List<Patient> patientList;
}
