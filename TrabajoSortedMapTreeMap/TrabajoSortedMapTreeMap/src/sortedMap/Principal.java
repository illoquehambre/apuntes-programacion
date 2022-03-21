package sortedMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El programa simula el ranking de una liga profesional de videojuegos, en este
		 * caso del League of Legends,tendremos diferentes opciones -1)Añadir nuevos
		 * equipos a la lista. -2)Ordenar el equipo en diferentes formas. -3)Eliminar
		 * equipos. -4)Mostrar la lista de los equipos y ganadores.
		 * 
		 */

		int id = 0,opcion=0;
		String nombreJugador, equipo, rol;
		
		SortedMap<Equipo, Integer> listaMap = new TreeMap<>(new PorEquipo());
		
		
		Jugador j1 = new Jugador("Rekkles", "Fent", 22, 2200, "ADC");
		Jugador j2 = new Jugador("Xpeke", "PeKe", 23, 2600, "MID");
		Jugador j3 = new Jugador("XTsui", "Com", 21, 2600, "TOP");
		Jugador j4 = new Jugador("Pulp", "Fiction", 27, 3200, "SUPPORT");
		Jugador j5 = new Jugador("Insec", "Creo", 24, 2600, "JUNGLER");
		
		List<Jugador> plantillaOrigen = new ArrayList<Jugador>();
		plantillaOrigen.add(j1);
		plantillaOrigen.add(j2);
		plantillaOrigen.add(j3);
		plantillaOrigen.add(j4);
		plantillaOrigen.add(j5);
		
		List<Jugador> plantillaFnatic = new ArrayList<Jugador>();
		
		Jugador j6 = new Jugador("Wunder", "Hansen", 19, 2600, "TOP");
		Jugador j7 = new Jugador("Razork", "Gutierrez", 21, 2400, "JUNGLER");
		Jugador j8 = new Jugador("Upset", "Lipp", 23, 2100, "ADC");
		Jugador j9 = new Jugador("Nisqi", "Fiction", 27, 3200, "SUPPORT");
		Jugador j10 = new Jugador("Humanoid", "Brázda", 22, 2600, "MID");
		
		plantillaFnatic.add(j6);
		plantillaFnatic.add(j7);
		plantillaFnatic.add(j8);
		plantillaFnatic.add(j9);
		plantillaFnatic.add(j10);
		
		List<Jugador> plantillaSktT1 = new ArrayList<Jugador>();
		
		Jugador j11 = new Jugador("Choi", "Woo-je", 19, 2600, "TOP");
		Jugador j12 = new Jugador("Oner", "Joon", 21, 2400, "JUNGLER");
		Jugador j13= new Jugador("Lee", "Min-hyeong", 23, 2100, "ADC");
		Jugador j14= new Jugador("Ryu", "Min-seok", 24, 3200, "SUPPORT");
		Jugador j15 = new Jugador("Faker", "Sang-hyeok", 22, 2600, "MID");
		
		plantillaSktT1.add(j11);
		plantillaSktT1.add(j12);
		plantillaSktT1.add(j13);
		plantillaSktT1.add(j14);
		plantillaSktT1.add(j15);
		
		Equipo e1 = new Equipo("\rOrigen\n"
				+ "█▀█ █▀█ █ █▀▀ █▀▀ █▄░█\r\n"
				+ "█▄█ █▀▄ █ █▄█ ██▄ █░▀█", "Red Bull,Logitech", plantillaOrigen, 20, 5, 22.06);
		Equipo e2 = new Equipo("\rFnatic\n"
				+ "█▀▀ █▄░█ ▄▀█ ▀█▀ █ █▀▀\r\n"
				+ "█▀░ █░▀█ █▀█ ░█░ █ █▄▄", "Coca-Cola", plantillaFnatic, 22, 12, 22.32);
		Equipo e3 = new Equipo("\rSkTelecom T1\n"
				+ "█▀ █▄▀   ▀█▀ █▀▀ █░░ █▀▀ █▀▀ █▀█ █▀▄▀█   ▀█▀ ▄█\r\n"
				+ "▄█ █░█   ░█░ ██▄ █▄▄ ██▄ █▄▄ █▄█ █░▀░█   ░█░ ░█", "Telecomunicaciones T1, Pepsi,Apple", plantillaSktT1, 30, 4, 20.03);
	
		listaMap.put(e1, id++);
		listaMap.put(e2, id++);
		listaMap.put(e3,id++);
		
		Liga ligaLVP = new Liga(listaMap, "LVP Liga Europea de League of Legends", "20/04/2022",
				"Cocacola,Red Bull,Samsung");
		
		System.out.println("\r\n" + 
				  "█░░ █ █▀▀ ▄▀█   █▀▀ █░█ █▀█ █▀█ █▀█ █▀▀ ▄▀█\r\n"
				+ "█▄▄ █ █▄█ █▀█   ██▄ █▄█ █▀▄ █▄█ █▀▀ ██▄ █▀█");
		
		System.out.println("\r\n" +
				  "██╗░░░░░███████╗░█████╗░░██████╗░██╗░░░██╗███████╗  ░█████╗░███████╗\r\n"
				+ "██║░░░░░██╔════╝██╔══██╗██╔════╝░██║░░░██║██╔════╝  ██╔══██╗██╔════╝\r\n"
				+ "██║░░░░░█████╗░░███████║██║░░██╗░██║░░░██║█████╗░░  ██║░░██║█████╗░░\r\n"
				+ "██║░░░░░██╔══╝░░██╔══██║██║░░╚██╗██║░░░██║██╔══╝░░  ██║░░██║██╔══╝░░\r\n"
				+ "███████╗███████╗██║░░██║╚██████╔╝╚██████╔╝███████╗  ╚█████╔╝██║░░░░░\r\n"
				+ "╚══════╝╚══════╝╚═╝░░╚═╝░╚═════╝░░╚═════╝░╚══════╝  ░╚════╝░╚═╝░░░░░\r\n" + "\r\n"
				+ "██╗░░░░░███████╗░██████╗░███████╗███╗░░██╗██████╗░░██████╗\r\n"
				+ "██║░░░░░██╔════╝██╔════╝░██╔════╝████╗░██║██╔══██╗██╔════╝\r\n"
				+ "██║░░░░░█████╗░░██║░░██╗░█████╗░░██╔██╗██║██║░░██║╚█████╗░\r\n"
				+ "██║░░░░░██╔══╝░░██║░░╚██╗██╔══╝░░██║╚████║██║░░██║░╚═══██╗\r\n"
				+ "███████╗███████╗╚██████╔╝███████╗██║░╚███║██████╔╝██████╔╝\r\n"
				+ "╚══════╝╚══════╝░╚═════╝░╚══════╝╚═╝░░╚══╝╚═════╝░╚═════╝░");
		System.out.println("Seleccione la opción que desea realizar");
	
		do {
			System.out.println("********************************************************************");
			System.out.println("*** 1)Mostrar una lista de todos los equipos actuales en la liga.***");
			System.out.println("*** 2)Ordenar equipo e imprimirlos por nombre			 ***");
			System.out.println("*** 3)Ordenar equipos e imprimirlos por pentakills		 ***");
			System.out.println("*** 4)Ordenar equipos e imprimirlos por puntos totales		 ***");
			System.out.println("*** 5)Ordenar jugadores e imprimirlos por puntos totales	 ***");
			System.out.println("*** 0)Salir.                                                     ***");
			System.out.println("********************************************************************");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				ligaLVP.mostrarTodosLosEquipos();
				break;
			case 2:
				listaMap = new TreeMap<>(new EquipoPorNombre());
				listaMap.put(e1, id++);
				listaMap.put(e2, id++);
				listaMap.put(e3, id++);
				ligaLVP.setEquipos(listaMap);
				ligaLVP.mostrarTodosLosEquipos();
				break;
			case 3:
				listaMap = new TreeMap<>(new PorPentakills());
				listaMap.put(e1, id++);
				listaMap.put(e2, id++);
				listaMap.put(e3, id++);
				ligaLVP.setEquipos(listaMap);
				ligaLVP.mostrarTodosLosEquipos();
				break;
			case 4:
				listaMap = new TreeMap<>(new PorEquipo());
				listaMap.put(e1, id++);
				listaMap.put(e2, id++);
				listaMap.put(e3, id++);
				ligaLVP.setEquipos(listaMap);
				ligaLVP.mostrarTodosLosEquipos();
				break;
			case 5:
				Collections.sort(plantillaFnatic, new PorNombre());
				Collections.sort(plantillaOrigen, new PorNombre());
				Collections.sort(plantillaSktT1, new PorNombre());
				ligaLVP.mostrarTodosLosEquipos();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
			}
			
		} while (opcion!=0);
	}
}