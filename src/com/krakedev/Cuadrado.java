package com.krakedev;

public class Cuadrado {
		public double lado;
		
		public double CalcularArea() {
			
			double area = lado * lado;
			return area;
		}

		
		public double CalcularPerimetro() {
			double perimetro;
			perimetro = lado * 4;
			return perimetro;
		}
	}
	  
