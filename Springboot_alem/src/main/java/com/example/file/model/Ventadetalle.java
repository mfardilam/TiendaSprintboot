package com.example.file.model;



import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "detalle_ventas")
public class Ventadetalle implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iddetalle_ventas;
    public int cantidad_producto;
    public int id_producto;
    public double valor_total;
    public int id_ventas;
    public double valor_venta;
    public int id_cliente;
	public long getIddetalle_ventas() {
		return iddetalle_ventas;
	}
	public void setIddetalle_ventas(long iddetalle_ventas) {
		this.iddetalle_ventas = iddetalle_ventas;
	}
	public int getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public int getId_ventas() {
		return id_ventas;
	}
	public void setId_ventas(int id_ventas) {
		this.id_ventas = id_ventas;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
}
