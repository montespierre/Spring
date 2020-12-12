package com.montespierre.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.montespierre.app.entity.Venta;
import com.montespierre.app.service.VentaService;



@Controller
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@GetMapping({"/","/todos"})
	public String listar(Model model) {
		List<Venta> lista = ventaService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("ventas", lista);
		
		return "/ventas/listado";
		
	}
}
