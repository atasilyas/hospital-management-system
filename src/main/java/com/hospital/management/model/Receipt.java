package com.hospital.management.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_receipt")
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Receipt extends AbstractEntity {

    @Column(name = "medicine_count")
    private String medicineCount;

    @Column(name = "total_pricse" , nullable = false )
    private String totalAmount;

    @Column(name = "recipe_number" , nullable = false, updatable = false)
    private String recipeNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany(mappedBy = "receipt" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<MedicineType> medicineType =  new ArrayList<>();



}
