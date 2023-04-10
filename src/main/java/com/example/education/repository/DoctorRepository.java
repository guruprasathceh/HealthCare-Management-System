package com.example.education.repository;

import com.example.education.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor getDoctorBySpecialization(String specialization);

    Doctor getDoctorByName(String name);
}
