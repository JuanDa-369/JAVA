package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
        System.out.println("====Plato A : Creado====");
		
		System.out.println("Nombre:" + platoA.getNombre());
	    System.out.println("Tipo:" + platoA.getTipo());
	    System.out.println("Precio:" + platoA.getPrecio());
	    System.out.println("Disponible:" + platoA.isDisponible());
	    
	    
	    Plato platoB = new Plato();
		
	    System.out.println("====Plato B : Creado====");
	    		
	    System.out.println("Nombre:" + platoB.getNombre());
	    System.out.println("Tipo:" + platoB.getTipo());
	    System.out.println("Precio:" + platoB.getPrecio());
	    System.out.println("Disponible:" + platoB.isDisponible());
	    
	    
	    
        Plato platoC = new Plato();
		
	    System.out.println("====Plato C : Creado====");
	    		
	    System.out.println("Nombre:" + platoC.getNombre());
	    System.out.println("Tipo:" + platoC.getTipo());
	    System.out.println("Precio:" + platoC.getPrecio());
	    System.out.println("Disponible:" + platoC.isDisponible());
	    
	    
	    
	    
        System.out.println("====Plato A : Valores asignados====");
	    
	    platoA.setNombre("Encocado de camaron");
	    platoA.setTipo("Plato fuerte");
	    platoA.setPrecio(4.50);
	    platoA.setDisponible(true);

		System.out.println("Nombre:" + platoA.getNombre());
	    System.out.println("Tipo:" + platoA.getTipo());
	    System.out.println("Precio:" + platoA.getPrecio());
	    System.out.println("Disponible:" + platoA.isDisponible());	    
	    
	    
	    
        System.out.println("====Plato B : Valores asignados====");
	    
	    platoB.setNombre("Encebollado");
	    platoB.setTipo("Plato fuerte");
	    platoB.setPrecio(2.50);
	    platoB.setDisponible(true);

		System.out.println("Nombre:" + platoB.getNombre());
	    System.out.println("Tipo:" + platoB.getTipo());
	    System.out.println("Precio:" + platoB.getPrecio());
	    System.out.println("Disponible:" + platoB.isDisponible());
	    
	    
System.out.println("====Plato C : Valores asignados====");
	    
	    platoC.setNombre("Torta de chocolate");
	    platoC.setTipo("Postre");
	    platoC.setPrecio(1.50);
	    platoC.setDisponible(false);

		System.out.println("Nombre:" + platoC.getNombre());
	    System.out.println("Tipo:" + platoC.getTipo());
	    System.out.println("Precio:" + platoC.getPrecio());
	    System.out.println("Disponible:" + platoC.isDisponible());
	    
	    
	    
	    
	    
	    
	    
	    	    
	    

	}

}
