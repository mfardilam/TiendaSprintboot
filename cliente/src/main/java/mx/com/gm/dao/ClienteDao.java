package mx.com.gm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.gm.domain.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long> {
	//CREA UNA IMPLEMENTACION POR DEFAULT SPRING 
	
}
