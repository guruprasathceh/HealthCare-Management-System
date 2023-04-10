package com.example.education.service;

import com.example.education.entity.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatientRecord(Patient patient);

    List<Patient> getAllPatients();

    Patient getPatientById(long id);

    void updatePatientById(Patient patient, long id);

    void deletePatientById(long id);
}
