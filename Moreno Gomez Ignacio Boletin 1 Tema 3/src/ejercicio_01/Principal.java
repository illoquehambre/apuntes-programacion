package ejercicio_01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0;
		Circulo c1;
		
		System.out.println("Introduzca el vlor del radio del círculo cuya área desea calcular");
		radio=Leer.datoDouble();
		c1= new Circulo(radio);
		System.out.println("El área de un círculo de radio = "+c1.getRadio()+" es: "+c1.calcularArea());

	}

}
