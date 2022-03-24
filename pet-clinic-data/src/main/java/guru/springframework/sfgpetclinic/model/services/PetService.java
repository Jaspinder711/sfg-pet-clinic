package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Owner save(Pet owner);

	Set<Pet> findAll();
}
