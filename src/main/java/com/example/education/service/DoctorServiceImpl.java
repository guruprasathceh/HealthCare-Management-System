package com.example.education.service;

import com.example.education.entity.Doctor;
import com.example.education.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository repository;

    public void registerDoctor(Doctor doctor) {
        repository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public Doctor getDoctorById(long id) {
        return repository.findById(id).get();
    }

    public Doctor getDoctorBySpecialization(String specialization) {
        return repository.getDoctorBySpecialization(specialization);
    }

    public Doctor getDoctorByName(String name) {
        return repository.getDoctorByName(name);

    }

    public void updateDoctorDetailsByName(String doctorName, Doctor doctor) {
        Doctor update_Doctor = getDoctorByName(doctorName);
        update_Doctor.setName(doctor.getName());
        update_Doctor.setEmail(doctor.getEmail());
        update_Doctor.setPhoneNumber(doctor.getPhoneNumber());
        repository.save(update_Doctor);
    }

    public void deleteDoctorById(long id) {
        repository.deleteById(id);
    }

}
