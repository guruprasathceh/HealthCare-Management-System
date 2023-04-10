package com.example.education.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "receptionist")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private long phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "receptionist")
    private List<Appointment> appointments;
}
