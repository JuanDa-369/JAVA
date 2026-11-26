package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validación;

public class TestValidacion {

	public static void main(String[] args) {
		Validación v1 = new Validación();
		
		boolean r1 = v1.validarMonto(2);
		boolean r2 = v1.validarMonto(34);
		boolean r3 = v1.validarMonto(-4);
		boolean r4 = v1.validarMonto(-45);
		
		System.out.println("Monto 2 = " + r1);
		System.out.println("Monto 34 = " + r2);
		System.out.println("Monto -4 = " + r3);
		System.out.println("Monto -45 = " + r4);
	}

}
