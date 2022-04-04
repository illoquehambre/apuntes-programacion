package ejercicio_03;

import java.time.LocalDate;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0, nReproducciones=0;
		String busqueda;
		List <Cancion> lista =new ArrayList <Cancion>();
		Playlist playlist=new Playlist(lista);
		
		
		playlist.getLista().add(new Cancion("Limonero","Gata Catana", "Banzai", "Rap", Duration.ofMinutes(2).plusSeconds(34), 215147, LocalDate.of(2017, 03, 24)));
		playlist.getLista().add(new Cancion("Cantando","Violadores del Verso", "Pura droga sin cortar", "Rap", Duration.ofMinutes(2).plusSeconds(34), 75524, LocalDate.of(2012, 03, 24)));
		playlist.getLista().add(new Cancion("Sin miedo a vivir","SFDK", "Sin miedo a vivir", "Rap", Duration.ofMinutes(2).plusSeconds(34), 873543, LocalDate.of(2017, 03, 24)));
		playlist.getLista().add(new Cancion("La Almagama","SFDK", "Sin miedo a vivir", "Rap", Duration.ofMinutes(2).plusSeconds(34), 45120, LocalDate.of(2017, 03, 24)));
		playlist.getLista().add(new Cancion("Rhymes like Dhymes","Dooms Day", "Books Of War", "Rap", Duration.ofMinutes(2).plusSeconds(34), 42533, LocalDate.of(2015, 03, 24)));
		playlist.getLista().add(new Cancion("And the snakes start to sing","Bring Me The Horizon", null, "Heavy-Metal", Duration.ofMinutes(2).plusSeconds(34), 215147, LocalDate.of(2007, 03, 24)));
		playlist.getLista().add(new Cancion("Obsceno","Kaze", null, "Rap", Duration.ofMinutes(2).plusSeconds(34), 21517847, LocalDate.of(2017, 07, 29)));
		playlist.getLista().add(new Cancion("Jungle","Tash Sultana", "Jungle", "Rock", Duration.ofMinutes(2).plusSeconds(34), 3434534, LocalDate.of(2017, 05, 24)));
		playlist.getLista().add(new Cancion("Adults are talking","The Strokes", "The new Abnormal", "Indie-Rock",Duration.ofMinutes(2).plusSeconds(34), 215147, LocalDate.of(2021, 03, 24)));
		
		
		
		
		
		
		do {
			System.out.println("Introduzca opción");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
				
			case 1:
				playlist.mostrarTodo();
				break;
			case 2:
				busqueda=Leer.dato();
				playlist.buscarPorNombre(busqueda);
				break;
			case 3:
				busqueda=Leer.dato();
				playlist.buscarPorAutor(busqueda);
				break;
				
			case 4:
				busqueda=Leer.dato();
				playlist.buscarPorAlbum(busqueda);
				break;
			case 5:
				busqueda=Leer.dato();
				playlist.buscarPorGenero(busqueda);
				break;
			case 6:
				nReproducciones=Leer.datoInt();
				playlist.buscarPorMasReproducciones(nReproducciones);
				break;
			case 7:
				busqueda=Leer.dato();
				playlist.contarInterpretesDeCancion(busqueda);
				break;
			default:
				System.out.println("Te has equivocao de número master");
			}
		}while(opcion!=0);
	}

}
