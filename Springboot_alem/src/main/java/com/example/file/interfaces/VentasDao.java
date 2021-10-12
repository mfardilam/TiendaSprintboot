package com.example.file.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.file.model.Cliente;
import com.example.file.model.Ventadetalle;

@Repository
public interface VentasDao extends CrudRepository<Ventadetalle, Long> {
	//CREA UNA IMPLEMENTACION POR DEFAULT SPRING 
	
}
