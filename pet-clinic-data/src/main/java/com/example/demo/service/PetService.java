package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();

}
