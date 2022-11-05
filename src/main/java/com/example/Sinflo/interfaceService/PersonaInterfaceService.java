package com.example.Sinflo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.Sinflo.model.Persona;

/*
 * Para que sirve optional? R = 
 * 
 * */
public interface PersonaInterfaceService {
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
