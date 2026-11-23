package com.krakedev.Test;

import com.krakedev.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
		System.out.println("----- Valores Iniciales -----");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuenta cuenta4 = new Cuenta("002285");
		cuenta4.setSaldo(851);
		
		Cuenta cuenta5 = new Cuenta("002285", "B", 73);
		
		Cuenta cuenta6 = new Cuenta("002285");
		cuenta6.setTipo("B");
		
		System.out.println("_____ Cuentas _____");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
	}
}