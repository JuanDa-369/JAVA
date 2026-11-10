package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
        System.out.println("====Plato A : Creado====");
		
		System.out.println("Nombre:" + platoA.nombre);
	    System.out.println("Tipo:" + platoA.tipo);
	    System.out.println("Precio:" + platoA.precio);
	    System.out.println("Disponible:" + platoA.disponible);
	    
	    
	    Plato platoB = new Plato();
		
	    System.out.println("====Plato B : Creado====");
	    		
	    System.out.println("Nombre:" + platoB.nombre);
	    System.out.println("Tipo:" + platoB.tipo);
	    System.out.println("Precio:" + platoB.precio);
	    System.out.println("Disponible:" + platoB.disponible);
	    
	    
	    
        Plato platoC = new Plato();
		
	    System.out.println("====Plato C : Creado====");
	    		
	    System.out.println("Nombre:" + platoC.nombre);
	    System.out.println("Tipo:" + platoC.tipo);
	    System.out.println("Precio:" + platoC.precio);
	    System.out.println("Disponible:" + platoC.disponible);
	    
	    
	    
	    
        System.out.println("====Plato A : Valores asignados====");
	    
	    platoA.nombre = "Encocado de camaron";
	    platoA.tipo = "Plato fuerte";
	    platoA.precio = 4.50;
	    platoA.disponible = true;

		System.out.println("Nombre:" + platoA.nombre);
	    System.out.println("Tipo:" + platoA.tipo);
	    System.out.println("Precio:" + platoA.precio);
	    System.out.println("Disponible:" + platoA.disponible);	    
	    
	    
	    
        System.out.println("====Plato B : Valores asignados====");
	    
	    platoB.nombre = "Encebollado";
	    platoB.tipo = "Plato fuerte";
	    platoB.precio = 2.50;
	    platoB.disponible = true;

		System.out.println("Nombre:" + platoB.nombre);
	    System.out.println("Tipo:" + platoB.tipo);
	    System.out.println("Precio:" + platoB.precio);
	    System.out.println("Disponible:" + platoB.disponible);
	    
	    
System.out.println("====Plato C : Valores asignados====");
	    
	    platoC.nombre = "Torta de chocolate";
	    platoC.tipo = "Postre";
	    platoC.precio = 1.50;
	    platoC.disponible = false;

		System.out.println("Nombre:" + platoC.nombre);
	    System.out.println("Tipo:" + platoC.tipo);
	    System.out.println("Precio:" + platoC.precio);
	    System.out.println("Disponible:" + platoC.disponible);
	    
	    
	    
	    
	    
	    
	    
	    	    
	    

	}

}
