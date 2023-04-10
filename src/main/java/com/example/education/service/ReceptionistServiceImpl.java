package com.example.education.service;

import com.example.education.entity.Receptionist;
import com.example.education.repository.ReceptionistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceptionistServiceImpl implements ReceptionistService {

    private final ReceptionistRepository repository;

    public void registerUserRepo(Receptionist receptionist) {
        repository.save(receptionist);
    }

    public List<Receptionist> getAllReceptionist() {
        return repository.findAll();
    }

    public Receptionist findReceptionistById(long id) {
        return repository.findById(id).get();
    }

    public void updateReceptionistById(Receptionist receptionist, long id) {

        Receptionist update_receptionist = findReceptionistById(id);
        update_receptionist.setName(receptionist.getName());
        update_receptionist.setEmail(receptionist.getEmail());
        update_receptionist.setPhoneNumber(receptionist.getPhoneNumber());
        repository.save(update_receptionist);
    }

    public void deleteReceptionistById(long id) {
        repository.deleteById(id);
    }


}
