package com.example.education.controller;

import com.example.education.entity.Appointment;
import com.example.education.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping("/appointment")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping("/appointment")
    public void saveAppointmentDetails(@RequestBody Appointment appointment) {
        appointmentService.saveAppointmentDetails(appointment);
    }

    @PutMapping("/appointment/{id}")
    public void   updateAppointmentDetailsById(@RequestBody Appointment appointment, @PathVariable long id) {
        appointmentService.updateAppointment(appointment, id);
    }

    @DeleteMapping("/appointment/{id}")
    public void deleteAppointmentById(@PathVariable long id) {
        appointmentService.deleteAppointmentById(id);
    }
}
