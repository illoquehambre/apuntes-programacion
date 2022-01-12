package ejercicio_09;

import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  menu=0;
		Ticket t1=new Ticket(15);
		
		System.out.println("Iniciando el programa de venta de tickets");
		do {
			System.out.println("\n\tPulse\t\tPara\n");
			System.out.println("\t0\t\tSalir");
			System.out.println("\t1\t\tCambiar el precio de los tickets");
			System.out.println("Vender tickets");
			menu=Leer.datoInt();
			switch(menu) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("Indique el nuevo precio de los tickets");
				t1.setPrecioUd(Leer.datoDouble());
			case 2:
				System.out.println("Compra de tickets");
				System.out.println("¿Cuántos tickets quiere comprar?");
			}
		}while(menu!=0);
	}

}
