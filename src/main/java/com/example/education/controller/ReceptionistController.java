package com.example.education.controller;

import com.example.education.entity.Receptionist;
import com.example.education.service.ReceptionistServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ReceptionistController {

    private final ReceptionistServiceImpl service;

    @PostMapping("/receptionist")
    public void newUser(@RequestBody Receptionist receptionist) {
        service.registerUserRepo(receptionist);
    }

    @GetMapping("/receptionist")
    public List<Receptionist> getAllReceptionists() {
        return service.getAllReceptionist();
    }

    @PutMapping("/receptionist/{id}")
    public void updateReceptionistById(@RequestBody Receptionist receptionist, @PathVariable long id) {
        service.updateReceptionistById(receptionist, id);
    }

    @DeleteMapping("/receptionist/{id}")
    public void deleteReceptionistById(@PathVariable long id) {
        service.deleteReceptionistById(id);
    }


}
