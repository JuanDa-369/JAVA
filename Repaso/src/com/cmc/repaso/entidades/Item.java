package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	public void imprimir() {
		System.out.println("P Actual: " + productosActuales);
		System.out.println("P Devueltos : " + productosDevueltos);
		System.out.println("P Vendido : " + productosVendidos);
	}
		
	public void vender(int cantidadVendida) {
		this.productosActuales -= cantidadVendida;
		this.productosVendidos += cantidadVendida;
	}
	
	public void devolver(int devueltos) {
		this.productosActuales += devueltos;
		this.productosVendidos -= devueltos;
		this.productosDevueltos += devueltos;
	}
	
}
