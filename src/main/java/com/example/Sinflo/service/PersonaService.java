package com.example.Sinflo.service;

import java.util.List;
import java.util.Optional;

import com.example.Sinflo.interfaceService.PersonaInterfaceService;
import com.example.Sinflo.interfaces.PersonaInterface;
import com.example.Sinflo.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonaService implements PersonaInterfaceService {
	@Autowired
	/* Anotación que permite inyectar unas dependencias con 
	 * otras dentro de Spring.
	 * Una vez que ya este la anotación podemos usar los
	 * metodos esa clase. 
	 * */
	private PersonaInterface data;
	
	@Override
	public List<Persona> listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
