package com.hospital.management.repository;

import com.hospital.management.model.MedicineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineTypeRepository extends JpaRepository<MedicineType , String> {
}
