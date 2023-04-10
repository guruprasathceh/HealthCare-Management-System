package com.example.education.service;

import com.example.education.entity.Receptionist;

import java.util.List;

public interface ReceptionistService {

    void registerUserRepo(Receptionist receptionist);

    List<Receptionist> getAllReceptionist();

    void updateReceptionistById(Receptionist receptionist, long id);

    void deleteReceptionistById(long id);
}
