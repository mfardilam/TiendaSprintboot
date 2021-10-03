package mx.com.gm.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.gm.domain.Cliente;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
	//CREA UNA IMPLEMENTACION POR DEFAULT SPRING 
	
}
