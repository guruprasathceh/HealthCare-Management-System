package com.example.education.controller;

import com.example.education.entity.Doctor;
import com.example.education.service.DoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorServiceImpl doctorService;

    @PostMapping("/doctor")
    public void registerDoctor(@RequestBody Doctor doctor) {
        doctorService.registerDoctor(doctor);
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PutMapping("/doctor/{name}")
    public void updateDoctorByName(@RequestBody Doctor doctor, @PathVariable String name) {
        doctorService.updateDoctorDetailsByName(name, doctor);
    }

    @DeleteMapping("/doctor/{id}")
    public void deletePatientById(@PathVariable long id) {
        doctorService.deleteDoctorById(id);
    }

}
