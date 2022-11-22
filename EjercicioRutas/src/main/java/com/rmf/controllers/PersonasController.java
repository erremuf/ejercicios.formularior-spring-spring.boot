package com.rmf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/personas")
public class PersonasController {
	
	@GetMapping("/index")
	public String index(Model model) {
		System.out.println("Llamando al método index");
		model.addAttribute("mensaje", "Estoy en .../personas/index en la página index.html");
		return "index";
	}
	
	@GetMapping("/lista-personas")
	public String listaPersonas(Model model) {
		System.out.println("Llamando al método listaPersonas");
		model.addAttribute("mensaje", "Estoy en .../personas/lista-personas en la página index.html");
		return "index";
	}
	
	@GetMapping("/alta-personas")
	public String altaPersona(Model model) {
		System.out.println("Llamando al método altaPersona");
		model.addAttribute("mensaje", "Estoy en .../personas/alta-persona en la página index.html");
		return "index";
	}

}
