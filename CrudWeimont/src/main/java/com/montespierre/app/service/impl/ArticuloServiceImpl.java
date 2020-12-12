package com.montespierre.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montespierre.app.entity.Articulo;
import com.montespierre.app.repository.ArticuloRepository;
import com.montespierre.app.service.ArticuloService;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	private ArticuloRepository repository;
	
	@Override
	public List<Articulo> listarTodos() {
		List<Articulo> lista = (List<Articulo>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Articulo articulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Articulo buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
