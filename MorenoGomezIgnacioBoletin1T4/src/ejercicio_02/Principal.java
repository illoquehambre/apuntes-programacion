package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0;
		String fecha=null,encabezado="Documento base", encabezado1 = "Carta", encabezado2="Tarjeta de visita", nombre, apellidos, telefono, correo;
		Carta c;
		Documento d=new Documento(encabezado);
		TarjetaVisita tj;
		
		System.out.println("Bienvenido a mi programa de ejercicio 2");
		
		do {
			System.out.println("\n\n\tPULSE\t\tPARA");
			System.out.println("\t0\t\tSALIR");
			System.out.println("\t1\t\tGENERAR DOCUMENTO");
			System.out.println("\t2\t\tGENERAR CARTA");
			System.out.println("\t3\t\tGENERAR TARJETA DE VISITA\n\n");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 0:
					System.out.println("Fin del programa");
					break;
				case 1:
					System.out.println(d);
					break;
				case 2:
					System.out.println("Introduzca la fecha de creación");
					fecha=Leer.dato();
					c=new Carta(encabezado1,fecha);
					System.out.println(c);
					break;
				case 3:
					System.out.println("Introduzca un nombre:");
					nombre=Leer.dato();
					System.out.println("Introduzca apellidos:");
					apellidos=Leer.dato();
					System.out.println("Introduzca número de teléfono");
					telefono=Leer.dato();
					System.out.println("Introduzca un correo electrónico");
					correo=Leer.dato();
					tj=new TarjetaVisita(encabezado2,nombre, apellidos, telefono, correo);
					System.out.println(tj);
					break;
				default:
					System.out.println("ERROR \nOPCIÓN NO DISPONIBLE");
			}
		}while(opcion!=0);
		
		
		
		
		
	
	}

}
