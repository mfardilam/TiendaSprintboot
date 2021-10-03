package com.example.file.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.file.interfaceServices.IUsuarioService;
import com.example.file.model.Usuarios;

@Controller
@RequestMapping
public class UsuariosControlador {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuarios> usuarios = service.listar();
		model.addAttribute("usuarios", usuarios);
		return "inicio";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("usuarios", new Usuarios());
		return "nuevoUser";
	}
	@PostMapping("/save")
	public String save(@Validated Usuarios user,Model model) {
		service.save(user);
		return "redirect:/listar";		
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Usuarios> usuarios = service.listarId(id);
		model.addAttribute("usuarios", usuarios);
		return "nuevoUser";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
