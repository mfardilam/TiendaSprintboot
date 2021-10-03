package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Cliente;
import mx.com.gm.servicio.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/")
	public String inicio(Model model) {

		var clientes = clienteService.listarClientes();
		model.addAttribute("clientes", clientes);

		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Cliente cliente) {
		return "modificar";
		
	}
	
	@PostMapping("/guardar")
	public String guardar(Cliente cliente) {
		clienteService.guardar(cliente);
		return "redirect:/";  //enviame nuevamente a la pagina de inicio
	}
	
	@GetMapping("/editar/{idcliente}")
	public String editar(Cliente cliente,Model model) {//no es necesario inicializar el objeto
		cliente = clienteService.encontrarCliente(cliente);
		model.addAttribute("cliente", cliente);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{idcliente}")
public String eliminar(Cliente cliente) {
		clienteService.eliminar(cliente);
		return "redirect:/";
	}		
	}  
