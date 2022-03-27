package proyecto;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, buscar, nuevoTexto;
		int opcion=0, opcion2=0;
		Seccion actual;
		List <Seccion> lista = new ArrayList<Seccion>();
		Documento hj = new Documento(lista);
		
		do {
			System.out.println("Introduzca opcion");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 0:
					System.out.println("Fin del programa");
					break;
				case 1:
					System.out.println("Mostrar documento");//StringJoiner(add)(S)
					hj.mostrarTodo();
					break;
				case 2:
					System.out.println("Seleccionar la sección que quiera modificar");
					System.out.println("Introduzca el nombre de la sección");
					nombre=Leer.dato();
					actual=hj.buscarPorNombre(nombre); 
					do {
						System.out.println("Introduzca opción");
						opcion2=Leer.datoInt();
						switch(opcion2) {
							case 0:
								break;
							case 1:	
								System.out.println("Mostrar Sección actual");//(S)
								actual.mostrarMensajeActual();
								break;
							case 2:	
								System.out.println("Añadir más texto al final");//StringBuilder (Append)(S)
								System.out.println("Introduzca que una cadena de caracteres para añadir");
								nuevoTexto=Leer.dato();
								hj.agregarTextoFinal(nuevoTexto, actual);
								
								break;
							case 3:
								System.out.println("Mostrar índice de una cadena buscada");//StringBuilder(indexOf)	(S)							
								break;
							case 4:	
								System.out.println("Añadir texto en una posición indicada");//StringBuilder(insert) (S)
								break;
							case 5:
								System.out.println("Eliminar texto en una posición indicada");//StringBuilder(delete)(S)
								break;
							case 6:
								System.out.println("Hacer mayúscula la primera letra de cada palabra");//String(toCharArray, ToUpperCase) (S)
								hj.convertirPrimeraLetraMayuscula(actual);
								break;
							case 7:
								System.out.println("Reemplazar todas las cadenas de caracteres encontradas por otra");//String(Replace All) (S)
								System.out.println("Introduzca el texto que desea sustituir");
								buscar=Leer.dato();
								System.out.println("Introduce el nuevo texto");
								nuevoTexto=Leer.dato();
								hj.sustituirCadenaDeCaracteres(actual, buscar, nuevoTexto);
								break;
							case 8: 
								System.out.println("Invertir caracteres"); //StringBuilder(reverse)(S)
								hj.ponerAlReves(actual);
								break;
							default:
								System.out.println("Opcion no disponible, intentelo de nuevo");
								break;
						}
					}while(opcion2!=0);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Opcion no disponible, intentelo de nuevo");
					break;
					
			}
		}while(opcion!=0);
	}

}
