package jadencase;

import utilidades.Leer;

public class Princpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		JadenCase prueba=new JadenCase();
		
		
		System.out.println("Introduzca una frase:");
		 frase=Leer.dato();
		System.out.println(prueba.toJadenCase(frase));
		
	}

}
