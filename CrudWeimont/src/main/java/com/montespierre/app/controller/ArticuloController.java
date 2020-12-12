package com.montespierre.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.montespierre.app.entity.Articulo;
import com.montespierre.app.service.ArticuloService;

@Controller
@RequestMapping({"/articulos"})
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping({"/", "/todos"})
	public String listar(Model model) {
		List<Articulo> lista = articuloService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("articulos", lista);
		return "/articulos/listado";
	}
}
