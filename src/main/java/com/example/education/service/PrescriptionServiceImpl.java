package com.example.education.service;

import com.example.education.entity.Prescription;
import com.example.education.repository.PrescriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrescriptionServiceImpl implements PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    public void savePrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);
    }

    public Prescription findPrescriptionById(long id) {
        return prescriptionRepository.findById(id).get();
    }

    public void updatePrescriptionById(Prescription prescription, long id) {
        Prescription update_Prescription = findPrescriptionById(id);
        update_Prescription.setMedication(prescription.getMedication());
        prescriptionRepository.save(update_Prescription);
    }

    public void deletePrescriptionById(long id) {
        prescriptionRepository.deleteById(id);
    }
}
