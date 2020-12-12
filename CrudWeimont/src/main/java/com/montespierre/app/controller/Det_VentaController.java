package com.montespierre.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.montespierre.app.entity.Det_Venta;
import com.montespierre.app.service.Det_VentaService;

@Controller
@RequestMapping({"/det_ventas"})
public class Det_VentaController {
	
	@Autowired
	private Det_VentaService det_VentaService;
	
	@GetMapping({"/", "/todos"})
	public String listar(Model model) {
		List<Det_Venta> lista = det_VentaService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("det_ventas", lista);
		return "/det_ventas/listado";
	}

}
