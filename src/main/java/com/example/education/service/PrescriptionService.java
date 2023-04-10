package com.example.education.service;

import com.example.education.entity.Prescription;

import java.util.List;

public interface PrescriptionService {

    List<Prescription> getAllPrescriptions();

    void savePrescription(Prescription prescription);

    void updatePrescriptionById(Prescription prescription, long id);

    void deletePrescriptionById(long id);
}
