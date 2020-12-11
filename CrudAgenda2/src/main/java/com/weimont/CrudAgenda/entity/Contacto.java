package com.weimont.CrudAgenda.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "contactos")
@SequenceGenerator(name = "sq_contacto", sequenceName = "sq_contacto",
allocationSize = 1)
public class Contacto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_contacto")
	public Long id;
	
	@Column(name = "nombre")
	public String nombre;
	
	@Column(name = "telefono")
	public Long telefono;
	
	public Contacto() {
		this.id = 0L;
		this.nombre = "";
		this.telefono = 0L;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	
	
}
