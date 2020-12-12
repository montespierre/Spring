package com.montespierre.app.service;

import java.util.List;

import com.montespierre.app.entity.Articulo;

public interface ArticuloService {

	public List<Articulo> listarTodos();
	public void grabar(Articulo articulo);
	public Articulo buscarPorId(Long id);
	public void eliminar(Long id);
}
