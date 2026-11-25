package com.krakedev.demo.tets;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(101, "Tasa");
		p1.setDescripción("Tasa con tematica navideña");
		p1.setPeso(0.25);
		
		System.out.println("Codigo: "+ p1.getCodigo());
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Descripcion: "+ p1.getDescripción());
		System.out.println("Peso: "+ p1.getPeso());

	}

}
