package listas_01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List es una interfaz, por lo que no puede ser instancia
		 * sin embargo, por polimorfismo
		 *  la instanciamos como ArrayList, la cual es una clase que implementa la interfaz List.
		 */
		List<String> lista=new ArrayList<String>();
		
		lista.add("Nacho");
		lista.add("Angel");
		
		System.out.println(lista);//aqui está usando su toString que hereda desde object
		
	}

}
