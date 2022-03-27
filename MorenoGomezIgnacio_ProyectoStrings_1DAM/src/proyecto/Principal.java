/*
 * La verdad que estoy un poco cansado de usar el Word para editar textos,
 * así que como soy un pedazo de programador voy a crear mi propio editor de texto en Java.
 * Este tendrá una clase Documento con una lista de distintas Secciones donde escribiremos, 
 * en estas secciones tendremos un atributo texto tipo String y un id para poder elegir bien en cual
 * queremos escribir.
 * Nuestro editor de texto deberá:
 * 1-Crear diversas secciones por defecto con un encabezado, pie de página para el documento y un par de saltos de línea entre secciones (StringJoiner)
 * 2-Elegir qué sección deseamos editar.
 * 3-Crear nuevas secciones.
 * 4-Añadir texto tanto al final como en una posición específica.
 * 5-Borrar texto.
 * 6-Sustituir todas las cadenas de caracteres buscadas por otra específica.
 * 7-Cambiar a modo 'capitalize', la primera letra de cada palabra en mayúscula y el resto minúscula.
 * 8-Poner todo el texto al revés.
 * 9-Mostrar el índice(posición) de una cadena buscada.
 * 10-Mostrar tanto el documento completo como la sección que en ese momento estemos editando.
 * 
 * -Los métodos para añadir texto pueden hacerse con String. Sin embargo, usaremos StringBuilder ya que es más óptimo.
*/

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
		Documento doc = new Documento(lista);
		CrudDocumento crudDoc=new CrudDocumento(doc);
		
		porDefecto="\t- ";
		crudDoc.agregarPorDefecto(porDefecto, limit);
		id=limit;
		do {
			System.out.println("\n\n\tPULSE\t\tPARA\n");
			System.out.println("\t0\t\tSALIR");
			System.out.println("\t1\t\tMostrar documento");//StringJoiner(add)(S)
			System.out.println("\t2\t\tSeleccionar la sección que quiera modificar");
			System.out.println("\t3\t\tCrear nueva Sección");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 0:
					System.out.println("Fin del programa");
					break;
				case 1:
					
					doc.mostrarTodo();
					break;
				case 2:
					
					System.out.println("Introduzca el id de la sección");
					buscarId=Leer.datoInt();
					actual=crudDoc.buscarPorNombre(buscarId);
					if(buscarId>0 && buscarId<doc.getLista().size()) {
						
						do {
							System.out.println("\n\n\tPULSE\t\tPARA\n");
							System.out.println("\t0\t\tVolver a la pantalla anterior");
							System.out.println("\t1\t\tMostrar Sección actual");//(S)
							System.out.println("\t2\t\tAñadir más texto al final");//StringBuilder (Append)(S)
							System.out.println("\t3\t\tMostrar índice de una cadena buscada");//StringBuilder(indexOf)	(S)	
							System.out.println("\t4\t\tAñadir texto en una posición indicada");//StringBuilder(insert) (S)
							System.out.println("\t5\t\tEliminar texto en una posición indicada");//StringBuilder(delete)(S)
							System.out.println("\t6\t\tHacer mayúscula la primera letra de cada palabra");//String(toCharArray, ToUpperCase) (S)
							System.out.println("\t7\t\tReemplazar todas las cadenas de caracteres encontradas por otra");//String(Replace All) (S)
							System.out.println("\t8\t\tInvertir caracteres"); //StringBuilder(reverse)(S)
							opcion2=Leer.datoInt();
							switch(opcion2) {
								case 0:
									break;
								case 1:	
									
									actual.mostrarMensajeActual();
									break;
								case 2:	
									
									System.out.println("Introduzca que una cadena de caracteres para añadir");
									nuevoTexto=Leer.dato();
									crudDoc.agregarTextoFinal(nuevoTexto, actual);
									actual.mostrarMensajeActual();
									break;
								case 3:
									
									System.out.println("Introduzca la cadena a buscar");
									buscar=Leer.dato();
									System.out.println(crudDoc.mostrarIndice(buscar, actual));
									actual.mostrarMensajeActual();
									break;
								case 4:	
									
									System.out.println("Introduce el nuevo texto a introducir");
									nuevoTexto=Leer.dato();
									System.out.println("introduzca la posición donde desea introducir su texto");
									buscarId=Leer.datoInt();
									crudDoc.agregarTextoPosicion(nuevoTexto, actual, buscarId);
									actual.mostrarMensajeActual();
									break;
								case 5:
									
									System.out.println("Introduce la posición de inicio");
									ini=Leer.datoInt();
									System.out.println("Introduce la posición de final");
									fin=Leer.datoInt();
									crudDoc.eliminarTextoPosicion(actual, ini, fin);
									actual.mostrarMensajeActual();
									break;
								case 6:
									
									crudDoc.convertirPrimeraLetraMayuscula(actual);
									actual.mostrarMensajeActual();
									break;
								case 7:
									
									System.out.println("Introduzca el texto que desea sustituir");
									buscar=Leer.dato();
									System.out.println("Introduce el nuevo texto");
									nuevoTexto=Leer.dato();
									crudDoc.sustituirCadenaDeCaracteres(actual, nuevoTexto, buscar);
									actual.mostrarMensajeActual();
									break;
									
								case 8: 
									
									crudDoc.ponerAlReves(actual);
									actual.mostrarMensajeActual();
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
					
					crudDoc.agregarSeccion(id, porDefecto);
					id++;
					break;
				
				default:
					System.out.println("Opcion no disponible, intentelo de nuevo");
					break;
					
			}
		}while(opcion!=0);
	}

}
