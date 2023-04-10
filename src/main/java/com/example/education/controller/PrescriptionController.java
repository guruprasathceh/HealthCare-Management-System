package com.example.education.controller;

import com.example.education.entity.Prescription;
import com.example.education.service.PrescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PrescriptionController {

    private final PrescriptionService prescriptionService;

    @GetMapping("/prescription")
    public List<Prescription> getAllPrescription() {
        return prescriptionService.getAllPrescriptions();
    }

    @PostMapping("/prescription")
    public void savePrescriptionDetails(@RequestBody Prescription prescription) {
        prescriptionService.savePrescription(prescription);
    }

    @PutMapping("/prescription/{id}")
    public void updatePrescriptionDetails(@RequestBody Prescription prescription, @PathVariable long id) {
        prescriptionService.updatePrescriptionById(prescription, id);
    }

    @DeleteMapping("/prescription/{id}")
    public void deletePrescriptionDetails(@PathVariable long id) {
        prescriptionService.deletePrescriptionById(id);
    }


}
