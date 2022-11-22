package com.rmf.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.rmf.models.Oferta;

@Controller
public class HomeController {
	
	@Autowired
	private Oferta oferta;
	
	@Autowired
	private Date fechaAlta;
	

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Listado de ofertas");
		model.addAttribute("ofertas", listaOfertas());

		return "index";
	}

	@GetMapping("/ofertas/{id}")
	public String verOferta(@PathVariable("id") int id, Model model) {
		
		oferta = listaOfertas().get(id-1);

		model.addAttribute("titulo", oferta.getNombre());
		model.addAttribute("mostrarOferta", oferta);

		return "ofertas";
	}
	

	private List<Oferta> listaOfertas() {

		List<Oferta> lista = new ArrayList<Oferta>();
		Oferta ofertaUno = new Oferta(1, 3, "Web Developer", "HTML, CSS, JS, Bootstrap, JAVA", "Remote", fechaAlta);
		Oferta ofertaDos = new Oferta(2, 1, "Java Developer", "Spring, Spring Boot, MicroServices", "Hybrid", fechaAlta);
		Oferta ofertaTres = new Oferta(3, 6, "UX Designer", "Usability, UI, Research", "Office", fechaAlta);
		Oferta ofertaCuatro = new Oferta(4, 2, "UI Designer", "Figma, CSS, Colors", "Hybrid", fechaAlta);
		Oferta ofertaCinco = new Oferta(5, 3, "FrontEnd Developer", "HTML, CSS, JS, Angular, React", "Remote", fechaAlta);

		lista.add(ofertaUno);
		lista.add(ofertaDos);
		lista.add(ofertaTres);
		lista.add(ofertaCuatro);
		lista.add(ofertaCinco);

		return lista;
	}

}
