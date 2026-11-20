package com.krakedev;

public class TestCuadrado {
	
	public static void main(String[] args) {
	Cuadrado c1 = new Cuadrado();
	c1.setLado(4);
	double resultadoArea1;
	
	resultadoArea1 = c1.CalcularArea();
	System.out.println("Resultado Area: " + resultadoArea1);
	double rPerimetro1 = c1.CalcularPerimetro();
	System.out.println("Resultado Perimetro1: " + rPerimetro1);
	
	
	Cuadrado c2 = new Cuadrado();
	c2.setLado(2);
	double resultadoArea2;
	
	resultadoArea2 = c2.CalcularArea();
	System.out.println("Resultado Area: " + resultadoArea2);
	double rPerimetro2 = c2.CalcularPerimetro();
	System.out.println("Resultado Perimetro2: " + rPerimetro2);
	
	

	Cuadrado c3 = new Cuadrado();
	c3.setLado(5);
	double resultadoArea3;	
	
	resultadoArea3 = c3.CalcularArea();
	System.out.println("Resultado Area: " + resultadoArea3);
	double rPerimetro3 = c3.CalcularPerimetro();
	System.out.println("Resultado Perimetro3: " + rPerimetro3);
	}
}
