package sortedMap;

import java.util.List;
import java.util.Objects;

public class Equipo {
	private String nombre;
	private String patrocinadores;
	private List<Jugador> integrantes;
	private int puntosTotales;
	private int cantPentakill;
	private double tiempoDeCierre;

	// Constructor

	public Equipo(String nombre, String patrocinadores, List<Jugador> integrantes, int puntosTotales, int cantPentakill,
			double tiempoDeCierre) {
		super();
		this.nombre = nombre;
		this.patrocinadores = patrocinadores;
		this.integrantes = integrantes;
		this.puntosTotales = puntosTotales;
		this.cantPentakill = cantPentakill;
		this.tiempoDeCierre = tiempoDeCierre;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(String patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public List<Jugador> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Jugador> integrantes) {
		this.integrantes = integrantes;
	}

	public int getPuntosTotales() {
		return puntosTotales;
	}

	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	public int getCantPentakill() {
		return cantPentakill;
	}

	public void setCantPentakill(int cantPentakill) {
		this.cantPentakill = cantPentakill;
	}

	public double getTiempoDeCierre() {
		return tiempoDeCierre;
	}

	public void setTiempoDeCierre(double tiempoDeCierre) {
		this.tiempoDeCierre = tiempoDeCierre;
	}

	// To String

	@Override
	public String toString() {
		return "Equipo\nNombre:" + nombre + "\nPatrocinadores:" + patrocinadores + "Integrantes:" + integrantes
				+ "\nPuntos totales:" + puntosTotales + "\tCantidad de Pentakills:" + cantPentakill + "\tTiempo de cierre:"
				+ tiempoDeCierre+"\n**************************************************************************************************";

	}
}
