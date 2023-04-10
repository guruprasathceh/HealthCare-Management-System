package com.example.education.controller;

import com.example.education.entity.Patient;
import com.example.education.service.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceImpl service;

    @PostMapping("/patient")
    public ResponseEntity<Patient> createPatientRecord(@RequestBody Patient patient) {
        Patient savePatient = service.savePatientRecord(patient);
        return new ResponseEntity<>(savePatient, HttpStatus.OK);
    }

    @GetMapping("/patient")
    public List<Patient> getPatientDetails() {
        return service.getAllPatients();
    }

    @PutMapping("/patient/{id}")
    public void updatePatientById(@RequestBody Patient patient, @PathVariable long id) {
        service.updatePatientById(patient, id);
    }

    @DeleteMapping("/patient/{id}")
    public void deletePatientById(@PathVariable long id) {
        service.deletePatientById(id);
    }
}
