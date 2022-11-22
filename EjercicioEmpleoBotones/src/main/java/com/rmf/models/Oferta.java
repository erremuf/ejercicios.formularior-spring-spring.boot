package com.rmf.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Oferta {

	private int id, experiencia;
	private String nombre, descripcion, lugar;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaAlta;

	// CONSTRUCTORES

	public Oferta() {
	}

	public Oferta(int id, int experiencia, String nombre, String descripcion, String lugar, Date fechaAlta) {
		super();
		this.id = id;
		this.experiencia = experiencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.fechaAlta = fechaAlta;
	}

	// GET & SET

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Oferta [id=" + id + ", experiencia=" + experiencia + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", lugar=" + lugar + ", fechaAlta=" + fechaAlta + "]";
	}

}
