package com.montespierre.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idEmpleado")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_empleados")
	private Long idEmpleado;
	
	@Column(name="nomEmp")
	private String nomEmp;
	
	@Column(name="puestoEmp")
	private String puestoEmp;
	
	@Column(name="telEmp")
	private Long telEmp;
	
	public Empleado() {
		idEmpleado = 0L;
		nomEmp = "";
		puestoEmp = "";
		telEmp = 0L;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getPuestoEmp() {
		return puestoEmp;
	}

	public void setPuestoEmp(String puestoEmp) {
		this.puestoEmp = puestoEmp;
	}

	public Long getTelEmp() {
		return telEmp;
	}

	public void setTelEmp(Long telEmp) {
		this.telEmp = telEmp;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nomEmp=" + nomEmp + ", puestoEmp=" + puestoEmp + ", telEmp="
				+ telEmp + "]";
	}
	
		

}
