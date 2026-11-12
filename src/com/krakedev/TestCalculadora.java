package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		int r1;
		
		r1 = c1.sumar(5, 3);
		System.out.println("Resultado Suma:" + r1);
		
		
		
		Calculadora c2 = new Calculadora();
		int r2;
		
		r2 = c2.restar(9, 2);
		System.out.println("Resultado Resta:" + r2);
		
		
		
		Calculadora c3 = new Calculadora();
		int r3;
		
		 r3 = c3.mutiplicar(2, 4);
		 System.out.println("Resultado multiplicar:" + r3);
	}

}
