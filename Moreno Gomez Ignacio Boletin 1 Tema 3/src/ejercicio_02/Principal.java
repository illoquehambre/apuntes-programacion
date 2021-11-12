package ejercicio_02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Operaciones o1;
		o1 =new Operaciones();
		System.out.println("Introduzca un número entero");
		n=Leer.datoInt();
		if(o1.esPar(n)==true){
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		if(o1.esPositivo(n)==true){
			System.out.println("Es positivo");
		}else {
			System.out.println("Es negativo");
		}
	}

}
