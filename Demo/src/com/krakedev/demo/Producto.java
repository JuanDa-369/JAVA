package com.krakedev.demo;

public class Producto {

	private int codigo;
	private String nombre;
	private String descripción;
	private double peso;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
}

