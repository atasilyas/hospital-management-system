package com.hospital.management.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "t_doctor")
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@ToString(callSuper = false)
public class Doctor extends  Person {



    @Enumerated(EnumType.STRING)
    @Column(name = "DEPARTMENT")
    private Department department;

    @Column(name = "graduated_university")
    private String graduatedUniversite;

    @Column(name = "experties_Level")
    private String expertiesLevel;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY , mappedBy = "doctor")
    private List<Receipt> receiptList =  new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "doctorList")
    private List<Patient> patientList =  new ArrayList<>();



}
