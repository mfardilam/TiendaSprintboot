package com.example.file.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.file.csv.Productos;
import com.example.file.model.Factura;

@Repository
public interface IFacturaDao extends CrudRepository<Factura, Long> {
	//CREA UNA IMPLEMENTACION POR DEFAULT SPRING 
	
}
