package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setAltura(5);
		r1.setBase(4);
		int resultadoArea;
	
		resultadoArea = r1.CalcularArea();
		System.out.println("Resultado:" + resultadoArea);
		double rPerimetro1 = r1.CalcularPerimetro();
		System.out.println("Perimetro1:" + rPerimetro1);
		
		
	Rectangulo r2 = new Rectangulo();
	r2.setAltura(6);
	r2.setBase(2);
	int resultadoArea2;

	
	resultadoArea2 = r2.CalcularArea();
	System.out.println("Resultado:" + resultadoArea2);
	double rPerimetro2 = r2.CalcularPerimetro();
	System.out.println("Perimetro2:" + rPerimetro2);
	
	Rectangulo r3 = new Rectangulo(4);
	int rArea3;
	
	rArea3 = r3.CalcularArea();
	System.out.println("R Area 3:" + rArea3);
	double rPerimetro3 = r3.CalcularPerimetro();
	System.out.println("R Perimetro 3:" + rPerimetro3);
	
	Rectangulo r4 = new Rectangulo(4,8);
	int rArea4;
	
	rArea4 =r4.CalcularArea();
	System.out.println("R Area 4:" + rArea4);
	double rPerimetro4 = r4.CalcularPerimetro();
	System.out.println("R Perimetro 4:" + rPerimetro4);
	}

	
	
}
