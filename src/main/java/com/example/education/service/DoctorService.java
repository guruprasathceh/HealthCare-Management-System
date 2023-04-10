package com.example.education.service;

import com.example.education.entity.Doctor;

public interface DoctorService {

    void registerDoctor(Doctor doctor);

    Doctor getDoctorById(long id);

    Doctor getDoctorBySpecialization(String specialization);

    Doctor getDoctorByName(String name);

    void updateDoctorDetailsByName(String doctorName, Doctor doctor);

    void deleteDoctorById(long id);
}
