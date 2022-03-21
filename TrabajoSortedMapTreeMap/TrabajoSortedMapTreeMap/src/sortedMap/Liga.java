package sortedMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Liga {
	private SortedMap<Equipo, Integer> equipos;
	private String nombre;
	private String fecha;
	private String patrocinadores;

	// Constructor
	protected Liga(SortedMap<Equipo, Integer> equipos, String nombre, String fecha, String patrocinadores) {
		super();
		this.equipos = equipos;
		this.nombre = nombre;
		this.fecha = fecha;
		this.patrocinadores = patrocinadores;
	}

	// Getters & Setters
	public SortedMap<Equipo, Integer> getEquipos() {
		return equipos;
	}

	public void setEquipos(SortedMap<Equipo, Integer> equipos) {
		this.equipos = equipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(String patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	// To String
	@Override
	public String toString() {
		return "Liga Equipos:" + equipos + "Nombre:" + nombre + "Fecha:" + fecha + "Patrocinadores:" + patrocinadores
				+ "\n";
	}

	public void mostrarTodosLosEquipos() {
		for (Entry<Equipo, Integer> entry : equipos.entrySet()) {
			Equipo key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "" + val);

		}

	}

}
