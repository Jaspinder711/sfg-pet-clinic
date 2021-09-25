package com.example.demo.service;

import java.util.Set;

import com.example.demo.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
