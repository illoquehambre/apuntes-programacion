package ejercicio_03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura, radio;
		Cilindro c1;
		
		System.out.println("Introduzca el radio de la base del cilindro");
		radio=Leer.datoDouble();
		System.out.println("Introduxca la altura del cilindro");
		altura=Leer.datoDouble();
		c1=new Cilindro(radio, altura);
		System.out.println("El volumen del cilindro es: "+c1.calcularVolumen());

	}

}
