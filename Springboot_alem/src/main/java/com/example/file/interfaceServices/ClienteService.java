package com.example.file.interfaceServices;

import java.util.List;
import com.example.file.model.Cliente;

public interface ClienteService {

	public List<Cliente> listarClientes();
	
	public void guardar(Cliente cliente);
	
	public void eliminar(Cliente cliente);
	
	public Cliente encontrarCliente(Cliente cliente);
}
