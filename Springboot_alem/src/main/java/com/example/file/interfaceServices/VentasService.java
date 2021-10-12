package com.example.file.interfaceServices;



import java.util.List;

import com.example.file.csv.Productos;

import com.example.file.model.Venta;
import com.example.file.model.Ventadetalle;

public interface VentasService {

	public List<Productos> obtenerProductos(String nombreProducto);

	public long agregarventa(Venta venta);
	public Venta obtenerVenta(String llaveVenta);

	public long agregarVentaDetalle(Ventadetalle ventadetalle);

}

