package com.rmf.controller;

import java.util.Arrays;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rmf.models.Coche;

/*
 *           RAFAEL:
 * 
 *           HE ESTADO HACIENDO PRUEBAS CON ESTE EJERCICIO, HE REDIIRIGIDO LOS DOS MÉTODOS CON SESSION Y REDIRECT,
 *           SIMPLEMENTE HAY QUE DESCOMENTAR UN BLOQUE PARA QUE FUNCION EL OTRO Y QUITAR EL SESSIONATTRIBUTE.
 *           
 *           CON RESPECTO A LA REDIRECCIÓN DEL INDEX, NO SE ME OCURRE OTRA FORMA DE HACERLO SIN
 *           QUE ME DE UN ERROR DE AMBIGUEDAD.
 *           
 * 
 */

@Controller
@SessionAttributes("coche")
public class IndexController {

	@Autowired
	private Coche coche;

	@ModelAttribute("listaColores")
	public List<String> listaColores() {
		return Arrays.asList("ROJO", "VERDE", "NEGRO", "BLANCO");
	}

	@GetMapping({ "/", "/index" })
	public String index(Model model) {
		model.addAttribute("titulo", "Rellena el formulario");
		model.addAttribute("coche", coche);
		return "redirect:/formulario";
	}

	@GetMapping("/formulario")
	public String redirect(Model model) {
		model.addAttribute("titulo", "Rellena el formulario");
		model.addAttribute("coche", coche);
		return "index";
	}

/////////////////////////////////////// REDIRIGIENDO CON REDIRECTATRIBUTES Y FLASHATRIBUTE --- (DESCOMENTAR @SESSIONATRIBUTES DE LA CLASE)

	/*
	 * @GetMapping("/coche") public String resultado() { return "coche"; }
	 * 
	 * 
	 * @PostMapping("/save") public String save(@RequestParam(name = "id") int
	 * id, @RequestParam(name = "marca") String marca,
	 * 
	 * @RequestParam(name = "modelo") String modelo, @RequestParam(name =
	 * "caballos") int caballos,
	 * 
	 * @RequestParam(name = "color") String color, @Valid Coche coche, BindingResult
	 * result, RedirectAttributes redirect, Model model) {
	 * 
	 * model.addAttribute("titulo", "Rellena el formulario");
	 * 
	 * if (result.hasErrors()) { return "index"; }
	 * 
	 * redirect.addFlashAttribute("titulo", "Resultado");
	 * redirect.addFlashAttribute("coche", coche);
	 * 
	 * return "redirect:/coche"; }
	 */

/////////////////////////////////////// REDIRIGIENDO CON SESSIONATRIBUTES Y SESSION STATUS (COMENTAR @SESSIONATRIBUTES DE LA CLASE)

	
	  @GetMapping("/coche") public String resultado(SessionStatus status, Model
	  model) { model.addAttribute("titulo", "Resultado");
	  
	  return "coche";
	  
	  }
	  
	  @PostMapping("/save") public String save(int id, String marca, String modelo,
	  int caballos, String color,
	  
	  @Valid Coche coche, BindingResult result, Model model, SessionStatus status)
	  {
	  
	  model.addAttribute("titulo", "Rellena el formulario");
	  
	  if (result.hasErrors()) { return "index"; }
	  
	  model.addAttribute("coche", coche);
	  
	  return "redirect:/coche"; }
	 

}
