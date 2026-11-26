package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item i1 = new Item();
		System.out.println("--Priducto 1--");
		i1.setProductosActuales(25);
		i1.imprimir();
		i1.vender(5);
		i1.imprimir();
		i1.devolver(2);
		i1.imprimir();
		
		System.out.println("--Priducto 2--");
		Item i2 = new 	Item();
		i2.setProductosActuales(46);
		i2.imprimir();
		i2.vender(4);
		i2.imprimir();
		i2.devolver(5);
		i2.imprimir();
		
		

	}

}
