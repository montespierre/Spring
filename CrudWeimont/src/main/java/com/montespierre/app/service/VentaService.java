package com.montespierre.app.service;

import java.util.List;

import com.montespierre.app.entity.Venta;



public interface VentaService {

	public List<Venta> listarTodos();
	public void grabar(Venta venta);
	public Venta buscarPorId(Long id);
	public void eliminar(Long id);
}
