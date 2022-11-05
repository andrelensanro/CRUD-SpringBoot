package com.example.Sinflo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.Sinflo.interfaceService.PersonaInterfaceService;
import com.example.Sinflo.model.Persona;


@RestController
@RequestMapping
public class Controler {
	@Autowired
	private PersonaInterfaceService iservice;
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = iservice.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
}
