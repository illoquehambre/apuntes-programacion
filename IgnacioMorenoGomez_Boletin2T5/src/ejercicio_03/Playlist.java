package ejercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
	
	private List<Cancion> lista;

	public Playlist(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Playlist [lista=" + lista + "]";
	}
	public void mostrarTodo() {
		lista.stream().forEach(System.out::println);
	}
	
	public List<Cancion> buscarPorNombre(String nombre) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> nombre.equalsIgnoreCase(cancion.getNombre()))
				.collect(Collectors.toList());
	}
		
	public List<Cancion> buscarPorAutor(String autor) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> autor.equalsIgnoreCase(cancion.getAutor()))
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarPorAlbum(String album) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> album.equalsIgnoreCase(cancion.getAlbum()))
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarPorGenero(String genero) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> genero.equalsIgnoreCase(cancion.getGenero()))
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarPorMasReproducciones(int reproducciones) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> reproducciones<(cancion.getnReproducciones()))
				.collect(Collectors.toList());
	}
	
	public int contarInterpretesDeCancion(String nombre) {//Comprobar que esto funciona
		return  lista.stream()
				.filter(cancion -> nombre.equalsIgnoreCase(cancion.getNombre()))
				.collect(Collectors.toList()).size();
	}
	
}	
