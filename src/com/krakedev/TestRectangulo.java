package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		int resultadoArea;
	
		resultadoArea = r1.CalcularArea();
		System.out.println("Resultado:" + resultadoArea);
		double rPerimetro1 = r1.CalcularPerimetro();
		System.out.println("Perimetro1:" + rPerimetro1);
		
		
	Rectangulo r2 = new Rectangulo();
	r2.altura = 6;
	r2.base = 2;
	int resultadoArea2;

	
	resultadoArea2 = r2.CalcularArea();
	System.out.println("Resultado:" + resultadoArea2);
	double rPerimetro2 = r2.CalcularPerimetro();
	System.out.println("Perimetro2:" + rPerimetro2);
	
	}

	
	
}
