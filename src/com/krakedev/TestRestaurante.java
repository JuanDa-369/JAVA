package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante rest1;
		rest1 = new Restaurante();
		
		System.out.println("====Restaurante 1 : Creado====");
		
		System.out.println("Nombre:" + rest1.nombre);
	    System.out.println("Dirección:" + rest1.direccion);
	    System.out.println("Calificación:" + rest1.calificacion);
	    
System.out.println("====Restaurante 1 : Valores asignados====");
	    
	    rest1.nombre = "El Manabá";
	    rest1.direccion = "AV. Guayaquil";
	    rest1.calificacion = 9.5;
	    

		System.out.println("Nombre:" + rest1.nombre);
	    System.out.println("Dirección:" + rest1.direccion);
	    System.out.println("Calificación:" + rest1.calificacion);
	    
	    
	    Restaurante rest2 = new Restaurante();
        System.out.println("====Restaurante 2 : Creado====");
		
		System.out.println("Nombre:" + rest2.nombre);
	    System.out.println("Dirección:" + rest2.direccion);
	    System.out.println("Calificación:" + rest2.calificacion);
	    
	    System.out.println("====Restaurante 2 : Valores asignados====");
	    
	    rest2.nombre = "El Veci";
	    rest2.direccion = "AV. La Prensa";
	    rest2.calificacion = 9.3;
	    

		System.out.println("Nombre:" + rest2.nombre);
	    System.out.println("Dirección:" + rest2.direccion);
	    System.out.println("Calificación:" + rest2.calificacion);
	    
	}

}
