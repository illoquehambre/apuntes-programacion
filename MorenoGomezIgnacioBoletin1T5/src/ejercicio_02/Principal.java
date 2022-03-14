package ejercicio_02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String nombre, apellidos;
		boolean vip=false;
		
		int opcion=0, antiguedad=0, aux=0;
		double dineroClub=0, dineroSoc=0;
		List <String> fechas=new ArrayList <String>();
		List <Socio> lista=new ArrayList <Socio>();
		gestionClub gest= new gestionClub(fechas, lista, dineroClub);
		Socio user;
		
		System.out.println("Bienvenido");
		do {
			System.out.println("Introduce opciónç");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("fin del programa");
				break;
			case 1:
				System.out.println("vamos a ñadir un socio, mete sus datos");
				System.out.println("nombre");
				nombre=Leer.dato();
				System.out.println("Apellidos");
				apellidos=Leer.dato();
				System.out.println("Antiguedad");
				antiguedad=Leer.datoInt();
				System.out.println("Pulse 0 si es VIP o cualquier otro número si no");
				aux=Leer.datoInt();
				if(aux==0) {
					vip=true;
				}else {
					vip=false;
				}
				System.out.println("Dinero base");
				dineroSoc=Leer.datoDouble();
				user=new Socio(nombre, apellidos, antiguedad, vip, dineroSoc);
				gest.agregarSocio(user);
				System.out.println("Socio creado satisfactoriamente");
				break;
			case 2:
				gest.mostrarTodo();
				System.out.println("\nIntroduce el id del socio que desea borrar");
				aux=Leer.datoInt();
				gest.borrarSocio(aux);
				break; 
			case 3: 
				gest.mostrarTodo();
				System.out.println("\nIntroduce el id del socio cuyo nombre que desea modificar");
				aux=Leer.datoInt();
				System.out.println("Introduzca el nuevo nombre");
				nombre=Leer.dato();
				gest.cambiarNombre(aux, nombre);
				break;
			case 4:
				gest.mostrarTodo();
			}
		}while(opcion!=0);
		
	}

}
