package holamundo;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limite=26;
		System.out.println("Cuantas veces desea decir hola mundo?");
		limite=Leer.datoInt();
		for(int i=0;i<limite;i++) {
			System.out.println(i+1+"º Hola muy wenos dias Mundo");
		}

	}

}
