package com.rmf.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Coche {

	@NotNull
	private int id, caballos;
	@NotEmpty
	private String marca, modelo, color;
	
	
	////////// CONSTRUCTORES
	
	public Coche(){}
	
	public Coche(@NotNull int id, @NotNull int caballos, @NotEmpty String marca, @NotEmpty String modelo,
			@NotEmpty String color) {
		super();
		this.id = id;
		this.caballos = caballos;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	

	////////// GET Y SET

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
}