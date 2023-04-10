package com.example.education.service;

import com.example.education.entity.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    void updateAppointment(Appointment appointment, long id);

    void deleteAppointmentById(long id);

    void saveAppointmentDetails(Appointment appointment);
}
