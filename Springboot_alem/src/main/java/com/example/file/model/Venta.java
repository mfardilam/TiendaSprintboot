package com.example.file.model;



import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "ventas")
public class Venta implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idventa;
    public double ivaventa;
    public double total_venta;
    public double valor_venta;
    public int id_usuario;
	public long getIdventa() {
		return idventa;
	}
	public void setIdventa(long idventa) {
		this.idventa = idventa;
	}
	public double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
}
