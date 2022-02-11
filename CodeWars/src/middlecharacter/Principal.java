package middlecharacter;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kata kata= new Kata();
		String aux;
		System.out.println("Introduzca una frase");
		aux=Leer.dato();
		 System.out.println(kata.getMiddle(aux));
	}

}
