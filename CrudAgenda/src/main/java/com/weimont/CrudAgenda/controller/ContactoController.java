package com.weimont.CrudAgenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weimont.CrudAgenda.entity.Contacto;
import com.weimont.CrudAgenda.service.ContactoService;


@Controller
@RequestMapping({"/contactos"})
public class ContactoController {

	@Autowired
	private ContactoService contactoService;
	
	@GetMapping({"/","/todos"})
	public String listar(Model model) {
		List<Contacto> lista = contactoService.listarTodos();
		model.addAttribute("titulo", "LISTA DE CONTACTOS");
		model.addAttribute("contactos", lista);
		return "/contactos/listado";
	}
}
