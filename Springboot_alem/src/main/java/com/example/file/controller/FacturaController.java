package com.example.file.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.file.csv.Productos;
import com.example.file.interfaceServices.ClienteService;
import com.example.file.model.Cliente;
import com.example.file.model.Factura;

@Controller
@RequestMapping("/factura")
@SessionAttributes("factura")
public class FacturaController {

@Autowired	
private ClienteService clienteService;
	
@GetMapping	("/form/{idcliente}")
public String crear(@PathVariable(value="idcliente") Long idcliente, Map<String,Object>model,RedirectAttributes flash) {
	
	Cliente cliente= clienteService.findOne(idcliente);
	
	if(cliente ==null) {
		flash.addFlashAttribute("error","no existe el cliente");
		return "redirect:/listarCliente";
		
	}
	
	Factura factura=new Factura();
	factura.setCliente(cliente);
	model.put("factura", factura);
	model.put("titulo", "crear factura");
	return "factura/form";
	
	
}

@GetMapping(value="/cargar-productos/{term}",produces= {"application/json"})
public @ResponseBody List<Productos> cargarProductos(@PathVariable String term){
	return clienteService.findByNombre(term);
}
	}  
