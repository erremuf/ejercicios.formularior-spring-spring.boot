package com.rmf.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rmf.models.Coche;

@Controller
public class HomeController {

	@Autowired
	Coche coche;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Formulario");
		model.addAttribute("coche", coche);

		return "index";
	}
	

	@PostMapping("/nuevo-coche")
	public String nuevoCoche(@RequestParam(name = "id") int id, @RequestParam(name = "marca") String marca,
			@RequestParam(name = "modelo") String modelo, @RequestParam(name = "caballos") int caballos,
			@RequestParam(name = "color") String color, @Valid Coche coche, BindingResult result, Model model) {
			
		if(result.hasErrors()) {
			return "index";
		}
		
		model.addAttribute("titulo", "Resultado");
		
		return "coche";
	}
}
