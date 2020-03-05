package com.hospital.management.dto;

import com.hospital.management.model.Doctor;
import com.hospital.management.model.MedicineType;
import lombok.Data;

import java.util.List;

@Data
public class ReceiptDto {

    private String medicineCount;
    private String totalAmount;
    private String recipeNumber;
    private Doctor doctor;
    private List<MedicineType> medicineType;

}
