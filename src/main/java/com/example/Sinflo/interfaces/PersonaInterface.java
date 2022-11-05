package com.example.Sinflo.interfaces;

import com.example.Sinflo.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaInterface extends CrudRepository<Persona, Integer> {
	
}
