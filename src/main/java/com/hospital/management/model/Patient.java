package com.hospital.management.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "t_patient")
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = false)
public class Patient extends Person {

    @Column(name = "sick_type")
    private String sickType;

    @Column(name = "height")
    private String height;

    @Column(name = "weight")
    private String weight;

    @Column(name = "emergenct_type")
    @Size(max = 10, min = 1)
    private Integer emergencyLevel;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    @JoinTable(name = "t_doctor_patient",
            joinColumns = { @JoinColumn(name = "doctor_id") },
            inverseJoinColumns = { @JoinColumn(name = "patient_id") })
    private List<Doctor> doctorList =  new ArrayList<>();






}
