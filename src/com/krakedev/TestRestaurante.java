package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante rest1;
		rest1 = new Restaurante();
		
		System.out.println("====Restaurante 1 : Creado====");
		
		System.out.println("Nombre:" + rest1.getNombre());
	    System.out.println("Dirección:" + rest1.getDireccion());
	    System.out.println("Calificación:" + rest1.getCalificacion());
	    
System.out.println("====Restaurante 1 : Valores asignados====");
	    
	    rest1.setNombre("El Manabá");
	    rest1.setDireccion("AV. Guayaquil");
	    rest1.setCalificacion(9.5);
	    

		System.out.println("Nombre:" + rest1.getNombre());
	    System.out.println("Dirección:" + rest1.getDireccion());
	    System.out.println("Calificación:" + rest1.getCalificacion());
	    
	    
	    Restaurante rest2 = new Restaurante();
        System.out.println("====Restaurante 2 : Creado====");
		
		System.out.println("Nombre:" + rest2.getNombre());
	    System.out.println("Dirección:" + rest2.getDireccion());
	    System.out.println("Calificación:" + rest2.getCalificacion());
	    
	    System.out.println("====Restaurante 2 : Valores asignados====");
	    
	    rest2.setNombre("El Veci");
	    rest2.setDireccion("AV. La Prensa");
	    rest2.setCalificacion(9.3);
	    

		System.out.println("Nombre:" + rest2.getNombre());
	    System.out.println("Dirección:" + rest2.getDireccion());
	    System.out.println("Calificación:" + rest2.getCalificacion());
	    
	}

}
