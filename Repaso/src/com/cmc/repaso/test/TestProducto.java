package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
	
		Producto p1 = new Producto("Zapato", 80);
		System.out.println("--Producto 1--");
		System.out.println("Producto:" + p1.getNombre());
		System.out.println("Precio: " + p1.getPrecio());
		
		p1.setPrecio(80);
		System.out.println("Comprobar precio: " + p1.getPrecio());
		
		double precioConDescuento = p1.calcularPrecioPromo(20);
		
		System.out.println("Producto en descuento:" +  precioConDescuento);


	}

}
