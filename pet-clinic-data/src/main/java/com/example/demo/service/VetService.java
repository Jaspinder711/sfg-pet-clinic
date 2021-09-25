package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.Vet;

public interface VetService {

Vet findById(Long id);
	
	Vet save(Vet Vet);
	
	Set<Vet> findAll();

}
