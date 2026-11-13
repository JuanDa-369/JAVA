package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	
   public int restar(int a, int b) {
	    int resultado;
	    resultado = a - b;
	    return resultado;
    }
	
   
   public int mutiplicar(int valor1, int valor2) {
	    int resultado;
	    resultado = valor1 * valor2;
	    return resultado;
   }    
   
   
   public double dividir(double dividendo, double divisor) {
	   double resultado;
	   resultado = dividendo / divisor;
	   return resultado;
   }
   
   
   public double promedio(double valor1, double valor2, double valor3) {
	   double suma;
	   double resultado;
	   suma = valor1 + valor2 + valor3;
	   resultado = suma / 3.0;
	   return resultado;
   }
   
   

	public void saludar() {
		
		System.out.println("AHIRITA NO JOVEN, SALI AL ALMUERZO.REGRESO EN 15 MINUTOS");
	}
   
}
