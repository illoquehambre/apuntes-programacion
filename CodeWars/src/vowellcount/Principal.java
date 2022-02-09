package vowellcount;

import contadorcaracteres.ContadorCaracteres;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		Vowell prueba= new Vowell();
		System.out.println("Introduzca una frase");
		frase=Leer.dato();
		System.out.println(prueba.getCount(frase));


	}

}
