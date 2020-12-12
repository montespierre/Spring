package com.montespierre.app.service;

import java.util.List;

import com.montespierre.app.entity.Det_Venta;


public interface Det_VentaService{

	public List<Det_Venta> listarTodos();
	public void grabar(Det_Venta det_Venta);
	public Det_Venta buscarPorId(Long id);
	public void eliminar(Long id);
}
