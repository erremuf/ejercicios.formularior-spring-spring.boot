package com.rmf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

	@GetMapping("/index/{nombre}/{apellidos}/{edad}")
	public String index(@PathVariable("nombre") String nombre, @PathVariable("apellidos") String apellidos,
			@PathVariable("edad") int edad) {

		System.out.println("\n\n-------------------------\n");
		System.out.println("Hola, " + nombre + " " + apellidos + "!\nTu edad es: " + edad + " años.");
		System.out.println("\n-------------------------\n\n");

		return "index";
	}
}
