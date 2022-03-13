package ejercicio_02;

import java.util.List;

public class gestionClub {
	
	private List <String> fechasPistasReservadas;
	private List <Socio> lista;
	private double dinero;
	public gestionClub(List<String> fechasPistasReservadas, List<Socio> lista, double dinero) {
		super();
		this.fechasPistasReservadas = fechasPistasReservadas;
		this.lista = lista;
		this.dinero = dinero;
	}
	public List<String> getFechasPistasReservadas() {
		return fechasPistasReservadas;
	}
	public void setFechasPistasReservadas(List<String> fechasPistasReservadas) {
		this.fechasPistasReservadas = fechasPistasReservadas;
	}
	public List<Socio> getLista() {
		return lista;
	}
	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "gestionClub [fechasPistasReservadas=" + fechasPistasReservadas + ", lista=" + lista + ", dinero="
				+ dinero + "]";
	}
	
	public void agregarSocio(Socio socio) {
		lista.add(socio);
	}
	
	public void borrarSocio(Socio socio) {
		lista.remove(socio);
	}
	
	public void cambiarNombre(Socio socio, String nombre) {
		socio.setNombre(nombre);
	}
	
	
}
