package proyecto;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buscar, nuevoTexto, porDefecto;
		int opcion=0, opcion2=0, limit=7, buscarId=0, ini=0, fin=0, id=0;
		Seccion actual;
		List <Seccion> lista = new ArrayList<Seccion>();
		Hoja hj = new Hoja(lista);
		
		porDefecto="\t- ";
		hj.agregarPorDefecto(porDefecto, limit);
		id=limit;
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
					buscarId=Leer.datoInt();
					actual=hj.buscarPorNombre(buscarId);
					if(buscarId>0 && buscarId<hj.getLista().size()) {
						
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
									System.out.println("Añadir más texto al final");//StringBuffer (Append)(S)
									System.out.println("Introduzca que una cadena de caracteres para añadir");
									nuevoTexto=Leer.dato();
									hj.agregarTextoFinal(nuevoTexto, actual);
									
									break;
								case 3:
									System.out.println("Mostrar índice de una cadena buscada");//StringBuffer(indexOf)	(S)	
									System.out.println("Introduzca la cadena a buscar");
									buscar=Leer.dato();
									System.out.println(hj.mostrarIndice(buscar, actual))									;
									break;
								case 4:	
									System.out.println("Añadir texto en una posición indicada");//StringBuffer(insert) (S)
									System.out.println("Introduce el nuevo texto a introducir");
									nuevoTexto=Leer.dato();
									System.out.println("introduzca la posición donde desea introducir su texto");
									buscarId=Leer.datoInt();
									hj.agregarTextoPosicion(nuevoTexto, actual, buscarId);
									break;
								case 5:
									System.out.println("Eliminar texto en una posición indicada");//StringBuffer(delete)(S)
									System.out.println("Introduce la posición de inicio");
									ini=Leer.datoInt();
									System.out.println("Introduce la posición de final");
									fin=Leer.datoInt();
									hj.eliminarCadenaDeCaracteres(actual, ini, fin);
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
									hj.sustituirCadenaDeCaracteres(actual, nuevoTexto, buscar);
									break;
								case 8: 
									System.out.println("Invertir caracteres"); //StringBuffer(reverse)(S)
									hj.ponerAlReves(actual);
									break;
								default:
									System.out.println("Opcion no disponible, intentelo de nuevo");
									break;
							}
						}while(opcion2!=0);
					}else {
						System.out.println("Esta sección no existe, intentalo de nuevo");
					}
					
					break;
				case 3:
					System.out.println("Crear nueva Sección");
					hj.agregarSeccion(id, porDefecto);
					id++;
					break;
				case 4:
					System.out.println("Cargar Secciones predeterminadas");
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
