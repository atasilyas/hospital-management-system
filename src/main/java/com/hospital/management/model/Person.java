package com.hospital.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_person")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Person extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String sName;

    @Column(name = "age")
    private String age;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
