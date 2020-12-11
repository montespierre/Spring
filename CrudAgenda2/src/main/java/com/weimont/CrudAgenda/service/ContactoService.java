package com.weimont.CrudAgenda.service;

import java.util.List;

import com.weimont.CrudAgenda.entity.Contacto;

public interface ContactoService {
	
	public List<Contacto> listarTodos();
	public void grabar(Contacto contacto);

}
