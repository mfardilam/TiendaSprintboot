package mx.com.gm.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.gm.dao.ClienteDao;
import mx.com.gm.domain.Cliente;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true) //solo leeme infomacion de la base de datos 
	public List<Cliente> listarClientes() {
		return (List<Cliente>) clienteDao.findAll(); //retorname una lista de tipo persona
		
		
	}

	@Override
	@Transactional //esto es para que me haga comit o rollback en la base de datos
	public void guardar(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void eliminar(Cliente cliente) {
		clienteDao.delete(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente encontrarCliente(Cliente cliente) {
		return clienteDao.findById(cliente.getIdcliente()).orElse(null);//en caso de que no encuentre el valor devuelveme null		
		
	}

}
