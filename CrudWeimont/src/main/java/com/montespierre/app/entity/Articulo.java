package com.montespierre.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo implements Serializable{
//Serializable: El objeto Articulo pueden ser convertidos a byte para ser transferidos por la internet. 
//Permite la comunicacion
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idArticulo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_articulos")
	private Long idArticulo;	
	
	@Column(name="descArticulo")
	private String descArticulo;
	
	@Column(name="precioUnit")
	private Double precioUnit;
	
	@Column(name="cantExis")
	private Long cantExis;
	
	public Articulo() {
		this.idArticulo = 0L;
		this.descArticulo = "";
		this.precioUnit = 0.00;
		this.cantExis = 0L;
	}

	public Long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getDescArticulo() {
		return descArticulo;
	}

	public void setDescArticulo(String descArticulo) {
		this.descArticulo = descArticulo;
	}

	public Double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(Double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public Long getCantExis() {
		return cantExis;
	}

	public void setCantExis(Long cantExis) {
		this.cantExis = cantExis;
	}

	@Override
	public String toString() {
		return "Articulos [idArticulo=" + idArticulo + ", descArticulo=" + descArticulo + ", precioUnit=" + precioUnit
				+ ", cantExis=" + cantExis + "]";
	}
	
	
}
