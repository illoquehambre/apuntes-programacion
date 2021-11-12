package proyecto;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int desde=1, hasta=1000, tam1=0, tam2=0, tam3=0, ganador1=0, ganador2=0, ganador3=0;
		int disponibles1=0, disponibles2=0, disponibles3=0, entradasVendidas1=0, entradasVendidas2=0, entradasVendidas3=0;
		Random randomEnt = new Random(System.nanoTime());
		String [] name1;
		String [] name2;
		String [] name3;
		int opcion1=0, cero=0, numEnt1=0, numEnt2=0, numEnt3=0, opcion2=0, opcion3=0;
		double precioEnt1=45, precioEnt2=65, precioEnt3=50;
		double precioTotEnt=0, precioTotEnt1=0, precioTotEnt2=0, precioTotEnt3=0, recaudo=0, pago=0, vuelta=0;
		String ent1="Sevilla FC-Deportivo Alavés", ent2="Sevilla FC-VfL Wolfsburgo", ent3="Sevilla FC-Villarreal CF";
		String date1="Jornada 13 LaLiga: Sábado 20/Noviembre-16:15h", date2="Jornada 5 ChampionsLeague: Martes 23/Noviembre-21:00h";
		String date3="Jornada 16 LaLiga: Domingo 05/Diciembre-17:00h";
		
		System.out.println("Bienvenidos a este programa. Estamos en la taquilla del Ramón Sánchez-Pizjuán para la venta de entradas de los 3 próximos partidos.");
		System.out.println("Primero, se va a generar un número aleatorio de entradas para comprar, simulando que el resto se venderían para la afición visitante.");
		System.out.println("A continuación, se puede elegir cualquiera de los 3 posibles partidos, en los que, después de cada compra, pedirá el nombre del asistente.");
		System.out.println("Se podrá consultar el ticket de compra para ver el total, y también se podrá consultar el total del dinero recaudado durante el día.");
		System.out.println("Esto, servirá para hacer un sorteo de un abono anual gratuito entre todos los que compren entradas al final del programa.");

		System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "─██████████████─██████████████─██████──────────██████─██████████████─██████──██████─██████████████─██████████████████────\r\n"
				+ "─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██████████──██░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░░░██────\r\n"
				+ "─██░░██████████─██░░██████░░██─██░░░░░░░░░░██──██░░██─██░░██████████─██░░██──██░░██─██░░██████████─████████████░░░░██────\r\n"
				+ "─██░░██─────────██░░██──██░░██─██░░██████░░██──██░░██─██░░██─────────██░░██──██░░██─██░░██─────────────────████░░████────\r\n"
				+ "─██░░██████████─██░░██████░░██─██░░██──██░░██──██░░██─██░░██─────────██░░██████░░██─██░░██████████───────████░░████──────\r\n"
				+ "─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░██──██░░██─██░░██─────────██░░░░░░░░░░██─██░░░░░░░░░░██─────████░░████────────\r\n"
				+ "─██████████░░██─██░░██████░░██─██░░██──██░░██──██░░██─██░░██─────────██░░██████░░██─██░░██████████───████░░████──────────\r\n"
				+ "─────────██░░██─██░░██──██░░██─██░░██──██░░██████░░██─██░░██─────────██░░██──██░░██─██░░██─────────████░░████────────────\r\n"
				+ "─██████████░░██─██░░██──██░░██─██░░██──██░░░░░░░░░░██─██░░██████████─██░░██──██░░██─██░░██████████─██░░░░████████████────\r\n"
				+ "─██░░░░░░░░░░██─██░░██──██░░██─██░░██──██████████░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░░░██────\r\n"
				+ "─██████████████─██████──██████─██████──────────██████─██████████████─██████──██████─██████████████─██████████████████────\r\n"
				+ "─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "──────────────────────────────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "─██████████████─██████████─██████████████████─────────██████─██████──██████─██████████████─██████──────────██████─\r\n"
				+ "─██░░░░░░░░░░██─██░░░░░░██─██░░░░░░░░░░░░░░██─────────██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██████████──██░░██─\r\n"
				+ "─██░░██████░░██─████░░████─████████████░░░░██─────────██░░██─██░░██──██░░██─██░░██████░░██─██░░░░░░░░░░██──██░░██─\r\n"
				+ "─██░░██──██░░██───██░░██───────────████░░████─────────██░░██─██░░██──██░░██─██░░██──██░░██─██░░██████░░██──██░░██─\r\n"
				+ "─██░░██████░░██───██░░██─────────████░░████───────────██░░██─██░░██──██░░██─██░░██████░░██─██░░██──██░░██──██░░██─\r\n"
				+ "─██░░░░░░░░░░██───██░░██───────████░░████─────────────██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██──██░░██──██░░██─\r\n"
				+ "─██░░██████████───██░░██─────████░░████───────██████──██░░██─██░░██──██░░██─██░░██████░░██─██░░██──██░░██──██░░██─\r\n"
				+ "─██░░██───────────██░░██───████░░████─────────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██████░░██─\r\n"
				+ "─██░░██─────────████░░████─██░░░░████████████─██░░██████░░██─██░░██████░░██─██░░██──██░░██─██░░██──██░░░░░░░░░░██─\r\n"
				+ "─██░░██─────────██░░░░░░██─██░░░░░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░██──██████████░░██─\r\n"
				+ "─██████─────────██████████─██████████████████─██████████████─██████████████─██████──██████─██████──────────██████─\r\n"
				+ "──────────────────────────────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "");
		tam1=randomEnt.nextInt(hasta-desde+1)+desde;
		tam2=randomEnt.nextInt(hasta-desde+1)+desde;
		tam3=randomEnt.nextInt(hasta-desde+1)+desde;
		name1= new String [tam1];
		name2= new String [tam2];
		name3= new String [tam3];
		disponibles1=tam1;
		disponibles2=tam2;
		disponibles3=tam3;		
		System.out.println("Entradas ya disponibles a la venta.\n");
		do {
			System.out.println("Elija una opción:");
			System.out.println("Pulse [1] para comprar entradas.");
			System.out.println("Pulse [2] para consultar el dinero recaudado.");
			System.out.println("Pulse [3] para iniciar el sorteo para los abonos.");
			System.out.println("Pulse [0] para terminar.");		
			opcion1=Leer.datoInt();
			switch(opcion1) {
				case 0:
					System.out.println("Fin.");
					break;
				case 1:
					do{
						System.out.println("\nElija la opción que desee:");
						System.out.println("Pulse [1] para comprobar el número de entradas diponibles.");
						System.out.println("Pulse [2] para el partido "+ent1+" de la "+date1+".");
						System.out.println("Pulse [3] para el partido "+ent2+" de la "+date2+".");
						System.out.println("Pulse [4] para el partido "+ent3+" de la "+date3+".");
						System.out.println("Pulse [5] para ver el ticket.");
						System.out.println("Pulse [6] para pagar.");
						System.out.println("Pulse [0] para volver al menú principal.");
						opcion2=Leer.datoInt();
						switch(opcion2) {
							case 0:
								break;
							case 1:
								System.out.println("El número de entradas disponibles para el partido "+ent1+" son "+disponibles1+".");
								System.out.println("El número de entradas disponibles para el partido "+ent2+" son "+disponibles2+".");
								System.out.println("El número de entradas disponibles para el partido "+ent3+" son "+disponibles3+".");
								break;
							case 2:
								if(disponibles1==cero) {
									System.out.println("No quedan entradas disponibles.");
								}else {
									System.out.println("El número de entradas disponibles para el partido "+ent1+" son "+disponibles1+".");
									System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt1);
									System.out.println("¿Cuántas entradas desea comprar?");
									numEnt1=Leer.datoInt();
									if(numEnt1<cero) {
										System.out.println("Error.");
									}else if(numEnt1>disponibles1) {
										System.out.println("No puede seleccionar más entradas de las que quedan.");
									}else if(numEnt1==cero) {
										System.out.println("Ninguna entrada seleccionada.");
									}else {
										System.out.println("La entrada es nominativa.");
										disponibles1=disponibles1-numEnt1;
										precioTotEnt1=(precioEnt1*numEnt1);
										for(int i=0;i<numEnt1;i++) {
											System.out.printf("Introduzca el nombre y apellidos del %dº asistente: ", i+1);
											name1[entradasVendidas1]=Leer.dato();
											entradasVendidas1++;
										}
										precioTotEnt1=(precioEnt1*numEnt1);
										System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt1);
									}
								}
								break;
							case 3:
								if(disponibles2==cero) {
									System.out.println("No quedan entradas disponibles.");
								}else {
									System.out.println("El número de entradas disponibles para el partido "+ent2+" son "+disponibles2+".");
									System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt2);
									System.out.println("¿Cuántas entradas desea comprar?");
									numEnt2=Leer.datoInt();
									if(numEnt2<cero) {
										System.out.println("Error.");
									}else if(numEnt2>disponibles2) {
										System.out.println("No puede seleccionar más entradas de las que quedan.");
									}else if(numEnt2==cero) {
										System.out.println("Ninguna entrada seleccionada.");
									}else {
										System.out.println("La entrada es nominativa.");
										disponibles2=disponibles2-numEnt2;
										precioTotEnt2=(precioEnt2*numEnt2);
										for(int i=0;i<numEnt2;i++) {
											System.out.printf("Introduzca el nombre y apellidos del %dº asistente: ", i+1);
											name2[entradasVendidas2]=Leer.dato();
											entradasVendidas2++;
										}
										precioTotEnt2=(precioEnt2*numEnt2);
										System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt2);
									}
								}
								break;
							case 4:
								if(disponibles3==cero) {
									System.out.println("No quedan entradas disponibles.");
								}else {
									System.out.println("El número de entradas disponibles para el partido "+ent3+" son "+disponibles3+".");
									System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt3);
									System.out.println("¿Cuántas entradas desea comprar?");
									numEnt3=Leer.datoInt();
									if(numEnt3<cero) {
										System.out.println("Error.");
									}else if(numEnt3>disponibles3) {
										System.out.println("No puede seleccionar más entradas de las que quedan.");
									}else if(numEnt3==cero) {
										System.out.println("Ninguna entrada seleccionada.");
									}else {
										System.out.println("La entrada es nominativa.");
										disponibles3=disponibles3-numEnt3;
										precioTotEnt3=(precioEnt3*numEnt3);
										for(int i=0;i<numEnt3;i++) {
											System.out.printf("Introduzca el nombre y apellidos del %dº asistente: ", i+1);
											name3[entradasVendidas3]=Leer.dato();
											entradasVendidas3++;
										}
										precioTotEnt3=(precioEnt3*numEnt3);
										System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt3);
									}
								}
								break;
							case 5:
								if(numEnt1==cero && numEnt2==cero && numEnt3==cero) {
									System.out.println("No ha seleccionado ninguna entrada.");
								}else {
									precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
									System.out.println("NºENTADAS\t\tPARTIDO\t\t\tPRECIO\t\tTOTAL");
									System.out.println("-----------------------------------------------------------------------");
									if(numEnt1!=cero) {
										System.out.printf("%d\t\t%s\t%.2f€\t\t%.2f€\n",numEnt1, ent1, precioEnt1, precioTotEnt1);
										System.out.println("-----------------------------------------------------------------------");
									}
									if(numEnt2!=cero) {
										System.out.printf("%d\t\t%s\t%.2f€\t\t%.2f€\n",numEnt2, ent2, precioEnt2, precioTotEnt2);
										System.out.println("-----------------------------------------------------------------------");
									}
									if(numEnt3!=cero) {
										System.out.printf("%d\t\t%s\t%.2f€\t\t%.2f€\n",numEnt3, ent3, precioEnt3, precioTotEnt3);
										System.out.println("-----------------------------------------------------------------------");
									}
									System.out.printf("\t\t\t\t\t\t\t\t%.2f€\n",precioTotEnt);
								}
								break;
							case 6:
								if(precioTotEnt!=0) {
								System.out.println("El precio total a pagar es de: "+precioTotEnt+"€.");
								System.out.println("Cómo desea pagar:");
								System.out.println("Pulse [1] para pagar en efectivo.");
								System.out.println("Pulse [2] para pagar con tarjeta.");
								opcion3=Leer.datoInt();
								switch(opcion3) {
									case 1:
										System.out.println("¿Cuánto dinero va a entregar?");
										pago=Leer.datoDouble();
										if(pago<precioTotEnt) {
											System.out.println("Le falta dinero para llegar al pago.");
										}else {
											vuelta=pago-precioTotEnt;
											System.out.printf("Su vuelta es: %.2f€.\n",vuelta);
											System.out.println("Operación aceptada");
										}
										recaudo=recaudo+precioTotEnt;
										precioTotEnt=0;
									
										precioTotEnt1=0;
										precioTotEnt2=0;
										precioTotEnt3=0;
										numEnt1=0;
										numEnt2=0;
										numEnt3=0;
										break;

									case 2:
										System.out.println("Introduzca la tarjeta o pase el ContactLess.");
										recaudo=recaudo+precioTotEnt;
										precioTotEnt=0;
										precioTotEnt1=0;
										precioTotEnt2=0;
										precioTotEnt3=0;
										numEnt1=0;
										numEnt2=0;
										numEnt3=0;
										break;
										
									default:
										System.out.println("Opción incorrecta.");
								}
								}else {
									System.out.println("No tiene entradas pendientes del pago");
								}
								break;
								default:
									System.out.println("Opción incorrecta.");
						}
					}while(opcion2!=0);
				case 2:
					System.out.printf("\nEl dinero recaudado en el día de hoy es: %.2f€.\n",recaudo);
					break;
				case 3:
					if(numEnt1==cero && numEnt2==cero && numEnt3==cero) {
						System.out.println("No se ha vendido ninguna entrada.\n");
					}else {
						ganador1=randomEnt.nextInt(entradasVendidas1-desde+1);
						System.out.println("Para partido 1, el ganador del sorteo para un abono gratis es: "+name1[ganador1]+".\n");
						ganador2=randomEnt.nextInt(entradasVendidas2-desde+1);
						System.out.println("Para partido 2, el ganador del sorteo para un abono gratis es: "+name2[ganador2]+".\n");
						ganador3=randomEnt.nextInt(entradasVendidas3-desde+1);
						System.out.println("Para partido 3, el ganador del sorteo para un abono gratis es: "+name3[ganador3]+".\n");
					}
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
		}while(opcion1!=cero);
		System.out.println("───────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "─██████──██████─██████──██████─██████████████─██████─────────██████──██████─██████████████─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██─────────██░░██──██░░██─██░░░░░░░░░░██─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░██████████─██░░██─────────██░░██──██░░██─██░░██████░░██─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░██─────────██░░██─────────██░░██──██░░██─██░░██──██░░██─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░██████████─██░░██─────────██░░██──██░░██─██░░██████░░██─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██─────────██░░██──██░░██─██░░░░░░░░░░██─\r\n"
				+ "─██░░██──██░░██─██░░██──██░░██─██░░██████████─██░░██─────────██░░██──██░░██─██░░██████░░██─\r\n"
				+ "─██░░░░██░░░░██─██░░██──██░░██─██░░██─────────██░░██─────────██░░░░██░░░░██─██░░██──██░░██─\r\n"
				+ "─████░░░░░░████─██░░██████░░██─██░░██████████─██░░██████████─████░░░░░░████─██░░██──██░░██─\r\n"
				+ "───████░░████───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██───████░░████───██░░██──██░░██─\r\n"
				+ "─────██████─────██████████████─██████████████─██████████████─────██████─────██████──██████─\r\n"
				+ "───────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────\r\n"
				+ "─██████████████─████████████████───██████████████─██████──────────██████─██████████████─██████████████─██████─██████─\r\n"
				+ "─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░██████████──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██─██░░██─\r\n"
				+ "─██░░██████░░██─██░░████████░░██───██░░██████░░██─██░░░░░░░░░░██──██░░██─██████░░██████─██░░██████░░██─██░░██─██░░██─\r\n"
				+ "─██░░██──██░░██─██░░██────██░░██───██░░██──██░░██─██░░██████░░██──██░░██─────██░░██─────██░░██──██░░██─██░░██─██░░██─\r\n"
				+ "─██░░██████░░██─██░░████████░░██───██░░██──██░░██─██░░██──██░░██──██░░██─────██░░██─────██░░██──██░░██─██░░██─██░░██─\r\n"
				+ "─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░██──██░░██─██░░██──██░░██──██░░██─────██░░██─────██░░██──██░░██─██░░██─██░░██─\r\n"
				+ "─██░░██████████─██░░██████░░████───██░░██──██░░██─██░░██──██░░██──██░░██─────██░░██─────██░░██──██░░██─██████─██████─\r\n"
				+ "─██░░██─────────██░░██──██░░██─────██░░██──██░░██─██░░██──██░░██████░░██─────██░░██─────██░░██──██░░██───────────────\r\n"
				+ "─██░░██─────────██░░██──██░░██████─██░░██████░░██─██░░██──██░░░░░░░░░░██─────██░░██─────██░░██████░░██─██████─██████─\r\n"
				+ "─██░░██─────────██░░██──██░░░░░░██─██░░░░░░░░░░██─██░░██──██████████░░██─────██░░██─────██░░░░░░░░░░██─██░░██─██░░██─\r\n"
				+ "─██████─────────██████──██████████─██████████████─██████──────────██████─────██████─────██████████████─██████─██████─\r\n"
				+ "─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
		
		System.out.println("Muchas gracias por utilizar este programa.");
	}
}


