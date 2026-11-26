package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Juan");
		e1.calificar(9.5);
		System.out.println("--Estudiante 1--");
		System.out.println("Nombre del estudiante: "+ e1.getNombre());
		System.out.println("Nota del estudiante: " + e1.getNota());
		System.out.println("Resultado del estudiante: " + e1.getResultado());
		
		Estudiante e2 = new Estudiante("Andrea");
		e2.calificar(5);
		System.out.println("--Estudiante 2--");
		System.out.println("Nombre del estudiante: "+ e2.getNombre());
		System.out.println("Nota del estudiante: " + e2.getNota());
		System.out.println("Resultado del estudiante: " + e2.getResultado());

	}

}
