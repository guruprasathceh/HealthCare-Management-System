package com.example.education.service;

import com.example.education.entity.Patient;
import com.example.education.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;

    public Patient savePatientRecord(Patient patient) {
        repository.save(patient);
        return patient;
    }


    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Patient getPatientById(long id) {
        return repository.findById(id).get();
    }

    public void updatePatientById(Patient patient, long id) {
        Patient update_Patient = getPatientById(id);
        update_Patient.setPatientName(patient.getPatientName());
        update_Patient.setAge(patient.getAge());
        update_Patient.setAddress(patient.getAddress());
        update_Patient.setIllness(patient.getIllness());
        repository.save(update_Patient);
    }

    public void deletePatientById(long id) {
        repository.deleteById(id);
    }


}
