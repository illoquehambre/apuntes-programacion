package ejercicio_03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Duration;

public class Cancion {
	
	private String nombre;
	private String autor;
	private String album;
	private String genero;
	private Duration duracion;
	private int nReproducciones;
	private LocalDate fechaLanzamiento;
	public Cancion(String nombre, String autor, String album, String genero, Duration duracion, int nReproducciones,
			LocalDate fechaLanzamiento) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.album = album;
		this.genero = genero;
		this.duracion = duracion;
		this.nReproducciones = nReproducciones;
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Duration getDuracion() {
		return duracion;
	}
	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}
	public int getnReproducciones() {
		return nReproducciones;
	}
	public void setnReproducciones(int nReproducciones) {
		this.nReproducciones = nReproducciones;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", album=" + album + ", genero=" + genero
				+ ", duracion=" + duracion + ", nReproducciones=" + nReproducciones + ", fechaLanzamiento="
				+ fechaLanzamiento + "]\n";
	}
	
	
	
	
	
}
