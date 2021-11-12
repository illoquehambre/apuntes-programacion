package arrays;
import java.util.Random;
import lectura.Leer;

public class Princiapl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int desde=1, hasta=1000, tam1=0, tam2=0, tam3=0, ganador1=0, ganador2=0, 
				ganador3=0, disponibles1=0, disponibles2=0, disponibles3=0, entradasVendidas1=0, entradasVendidas2=0, entradasVendidas3=0;
		Random randomEnt = new Random(System.nanoTime());
		String [] entDisp1;
		String [] entDisp2;
		String [] entDisp3;
		int opcion1=0, cero=0, numEnt1=0, numEnt2=0, numEnt3=0, opcion2=0, opcion3=0;
		double precioEnt1=45, precioEnt2=65, precioEnt3=50;
		double precioTotEnt=0, precioTotEnt1=0, precioTotEnt2=0, precioTotEnt3=0, recaudo=0, pago=0, vuelta=0;
		String ent1="Sevilla FC-Deportivo Alavés", ent2="Sevilla FC-VfL Wolfsburgo", ent3="Sevilla FC-Villarreal CF";
		String date1="Jornada 13 LaLiga: Sábado 20/Noviembre-16:15h", date2="Jornada 5 ChampionsLeague: Martes 23/Noviembre-21:00h";
		String date3="Jornada 16 LaLiga: Domingo 05/Diciembre-17:00h";
		

		
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
		entDisp1= new String [tam1];
		entDisp2= new String [tam2];
		entDisp3= new String [tam3];
		disponibles1=tam1;
		disponibles2=tam2;
		disponibles3=tam3;
		System.out.println("Entradas ya disponibles a la venta.\n");
		do {
			System.out.println("Elija una opción:");
			System.out.println("Pulse [1] para comprar entradas.");
			System.out.println("Pulse [2] para consultar el dinero recaudado.");
			System.out.println("Pulse [3] para iniciar el sorteo para los partidos.");
			System.out.println("Pulse [0] para salir.");
			
			opcion1=Leer.datoInt();
			
			switch(opcion1) {
				case 0:
					System.out.println("Fin.");
					break;
				case 1:
					do{
						System.out.println("¿A qué partido desea asistir?");
						System.out.println("Pulse [1] para comprobar el número de entradas diponibles.");
						System.out.println("Pulse [2] para: "+ent1+" de la "+date1+".");
						System.out.println("Pulse [3] para: "+ent2+" de la "+date2+".");
						System.out.println("Pulse [4] para: "+ent3+" de la "+date3+".");
						System.out.println("Pulse [5] para ver el ticket");
						System.out.println("Pulse [6] para pagar.");
						System.out.println("Pulse [0] para salir.");
						
						opcion2=Leer.datoInt();
						
						switch(opcion2) {
							case 0:
								break;
							case 1:
								System.out.println("El número de entradas disponibles para el partido: "+ent1+" son "+disponibles1+".");
								System.out.println("El número de entradas disponibles para el partido: "+ent2+" son "+disponibles2+".");
								System.out.println("El número de entradas disponibles para el partido: "+ent3+" son "+disponibles3+".");
								break;
							case 2:
								System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt1);
								System.out.println("¿Cuántas entradas desea comprar?");
								numEnt1=Leer.datoInt();
								if(numEnt1>disponibles1) {
									System.out.println("No hay suficientes entradas disponibles para este partido.");
								}else {
									System.out.println("La entrada es nominativa");
									disponibles1=disponibles1-numEnt1;
									for(int i=0;i<numEnt1;i++) {
										System.out.printf("Introduzca el %dºnombre: ", i+1);
										entDisp1[entradasVendidas1]=Leer.dato();
										
										precioTotEnt1=(precioEnt1*numEnt1);
										entradasVendidas1++;
									}
									precioTotEnt1=(precioEnt1*numEnt1);
									precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
									System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt1);
								}
								break;
							case 3:
								System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt2);
								System.out.println("¿Cuántas entradas desea comprar?");
								numEnt2=Leer.datoInt();
								if(numEnt2>disponibles2) {
									System.out.println("No hay suficientes entradas disponibles para este partido");
								}else {
									System.out.println("La entrada es nominativa");
									disponibles2=disponibles2-numEnt2;
									for(int i=0;i<numEnt2;i++) {
										System.out.printf("Introduzca el %dºnombre: ", i+1);
										entDisp2[entradasVendidas2]=Leer.dato();
										precioTotEnt2=(precioEnt2*numEnt2);
										entradasVendidas2++;
									}
									precioTotEnt2=(precioEnt2*numEnt2);
									precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
									System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt2);
								}									
								break;
							case 4:
								System.out.printf("El precio de las entradas es de: %.2f€.\n",precioEnt3);
								System.out.println("¿Cuántas entradas desea comprar?");
								numEnt3=Leer.datoInt();
								if(numEnt3>disponibles3) {
									System.out.println("No hay suficientes entradas disponibles para este partido");
								}else {
									System.out.println("La entrada es nominativa");
									disponibles3=disponibles3-numEnt3;
									for(int i=0;i<numEnt3;i++) {
										System.out.printf("Introduzca el %dºnombre: ", i+1);
										entDisp3[entradasVendidas3]=Leer.dato();
										precioTotEnt3=(precioEnt3*numEnt3);
										entradasVendidas3++;
									}
									
									precioTotEnt3=(precioEnt3*numEnt3);
									precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
									System.out.printf("El precio a pagar será de: %.2f€.\n",precioTotEnt3);
								}									
								break;
							case 5:
								if(precioTotEnt1!=0 || precioTotEnt2!=0 || precioTotEnt3!=0) {
								precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
								System.out.println("NºENTRADAS\t\tPARTIDO\t\t\tPRECIO\t\tTOTAL");
								System.out.println("-----------------------------------------------------------------------");
								if(numEnt1!=cero) {
									System.out.printf("%d\t\t%s\t%.2f€\t\t%.2f€\n",numEnt1, ent1, precioEnt1, precioTotEnt1);
									System.out.println("------------------------------------------------------------------------");
								}
								if(numEnt2!=cero) {
									System.out.printf("%d\t\t%s\t%.2f€\t\t%.2f€\n",numEnt2, ent2, precioEnt2, precioTotEnt2);
									System.out.println("------------------------------------------------------------------------");
								}
								if(numEnt3!=cero) {
									System.out.printf("%d\t\t%s\t%.2f€\t\t\t%.2f€\n",numEnt3, ent3, precioEnt3, precioTotEnt3);
									System.out.println("------------------------------------------------------------------------");
								}
								System.out.printf("\t\t\t\t\t\t\t\t%.2f€\n",precioTotEnt);
								}else {
								System.out.println("Seleccioné entradas para poder generar el ticket.");	
								}
								
								break;
							case 6:
								if(precioTotEnt!=0) {
								precioTotEnt=precioTotEnt1+precioTotEnt2+precioTotEnt3;
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
											disponibles1=disponibles1+numEnt1;
											disponibles2=disponibles2+numEnt2;
											disponibles3=disponibles3+numEnt3;
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
										break;
									case 2:
										System.out.println("Introduzca la tarjeta o pase el ContactLess.");
										recaudo=recaudo+precioTotEnt;
										precioTotEnt=0;

										precioTotEnt1=0;
										precioTotEnt2=0;
										precioTotEnt3=0;
										System.out.println("Operación realizada");
										break;
									
									default:
										System.out.println("Opción incorrecta.");
								}
								}else {
									System.out.println("No tiene entradas pendientes de pago.");
								}
								break;
							default:
								System.out.println("Opción incorrecta.");
						}
					}while(opcion2!=0);
				case 2:
					System.out.printf("El dinero recaudado en el día de hoy es: %.2f€.",recaudo);
					break;
				case 3:
					if(numEnt1==cero && numEnt2==cero && numEnt3==cero) {
						System.out.println("No se ha vendido ninguna entrada.\n");
					}else {
						if(entradasVendidas1==0) {
							System.out.println("No se han vendido entradas");
						}else {
							ganador1=randomEnt.nextInt(entradasVendidas1-desde+1);
							System.out.println("Para partido 1, el ganador del sorteo para un abono gratis es: ");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Calculando...");
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Felicidades  "+entDisp1[ganador1]);	
						}
						
						if(entradasVendidas2==0) {
							System.out.println("No se han vendido entradas");
						}else {
							ganador2=randomEnt.nextInt(entradasVendidas2-desde+1);
							System.out.println("Para partido 2, el ganador del sorteo para un abono gratis es: ");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Calculando...");
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Felicidades  "+entDisp2[ganador2]);
						}
						
						if(entradasVendidas3==0) {
							System.out.println("No se han vendido entradas");
						}else {
							ganador3=randomEnt.nextInt(entradasVendidas3-desde+1);
							System.out.println("Para partido 3, el ganador del sorteo para un abono gratis es: ");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Calculando...");
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("Felicidades  "+entDisp3[ganador3]);
							}	
						}
						
						
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
		}while(opcion1!=cero);

		System.out.println("\r\n"
				+ "██╗░░░██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░██╗░█████╗░    ██████╗░██████╗░░█████╗░███╗░░██╗████████╗░█████╗░██╗\r\n"
				+ "██║░░░██║██║░░░██║██╔════╝██║░░░░░██║░░░██║██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗████╗░██║╚══██╔══╝██╔══██╗██║\r\n"
				+ "╚██╗░██╔╝██║░░░██║█████╗░░██║░░░░░╚██╗░██╔╝███████║    ██████╔╝██████╔╝██║░░██║██╔██╗██║░░░██║░░░██║░░██║██║\r\n"
				+ "░╚████╔╝░██║░░░██║██╔══╝░░██║░░░░░░╚████╔╝░██╔══██║    ██╔═══╝░██╔══██╗██║░░██║██║╚████║░░░██║░░░██║░░██║╚═╝\r\n"
				+ "░░╚██╔╝░░╚██████╔╝███████╗███████╗░░╚██╔╝░░██║░░██║    ██║░░░░░██║░░██║╚█████╔╝██║░╚███║░░░██║░░░╚█████╔╝██╗\r\n"
				+ "░░░╚═╝░░░░╚═════╝░╚══════╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝    ╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═╝░░╚══╝░░░╚═╝░░░░╚════╝░╚═╝");
			
	}
}




