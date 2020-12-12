package com.montespierre.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montespierre.app.entity.Det_Venta;
import com.montespierre.app.repository.Det_VentaRepository;
import com.montespierre.app.service.Det_VentaService;

@Service
public class Det_VentaServiceImpl implements Det_VentaService{

	@Autowired
	private Det_VentaRepository	repository;
	
	@Override
	public List<Det_Venta> listarTodos() {
		List<Det_Venta> lista = (List<Det_Venta>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Det_Venta det_Venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Det_Venta buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
