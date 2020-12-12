package com.montespierre.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montespierre.app.entity.Venta;
import com.montespierre.app.repository.VentaRepository;
import com.montespierre.app.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaRepository repository;
	
	@Override
	public List<Venta> listarTodos() {
		List<Venta> lista = (List<Venta>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Venta venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Venta buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
