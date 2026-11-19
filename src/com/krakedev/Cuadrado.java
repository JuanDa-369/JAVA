package com.krakedev;

public class Cuadrado {
		private double lado;
		
		public double getLado() {
			return lado;
		}
		
		public void setLado(double lado) {
			this.lado = lado;
		}
		
		
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
	  
