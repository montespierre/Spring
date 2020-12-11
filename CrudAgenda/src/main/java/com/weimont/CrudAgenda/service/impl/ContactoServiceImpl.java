package com.weimont.CrudAgenda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.CrudAgenda.entity.Contacto;
import com.weimont.CrudAgenda.repository.ContactoRepository;
import com.weimont.CrudAgenda.service.ContactoService;


@Service
public class ContactoServiceImpl implements ContactoService{

	@Autowired
	private ContactoRepository repository;
	
	@Override
	public List<Contacto> listarTodos() {
		List<Contacto> lista = (List<Contacto>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Contacto contacto) {
		repository.save(contacto);
		
	}

}
