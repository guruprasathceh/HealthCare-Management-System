package com.example.education.service;

import com.example.education.entity.Appointment;
import com.example.education.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment findAppointmentById(long id) {
       return appointmentRepository.findById(id).get();
    }
    public void updateAppointment(Appointment appointment, long id) {
        Appointment update_Appointment = findAppointmentById(id);
        update_Appointment.setDoctor(appointment.getDoctor());
        update_Appointment.setPatient(appointment.getPatient());
        update_Appointment.setReceptionist(appointment.getReceptionist());
        appointmentRepository.save(update_Appointment);
    }

    public void deleteAppointmentById(long id) {
        appointmentRepository.deleteById(id);
    }

    public void saveAppointmentDetails(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
}
