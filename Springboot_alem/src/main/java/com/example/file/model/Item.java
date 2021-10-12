package com.example.file.model;

import com.example.file.csv.Productos;

public class Item extends Productos {
    private Float cantidad;

    
    
    
    
    public Item(int id, int codigo, String nombre, int nitp, double precioc, double iva, double preciov,Float cantidad) {
		super(id, codigo, nombre, nitp, precioc, iva, preciov);
		  this.cantidad = cantidad;
		// TODO Auto-generated constructor stub
	}
	

   

    public void aumentarCantidad() {
        this.cantidad++;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return this.getPreciov() * this.cantidad;
    }

}




	

	

	


