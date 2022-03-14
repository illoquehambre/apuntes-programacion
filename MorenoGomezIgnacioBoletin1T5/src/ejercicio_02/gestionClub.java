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
	
	public void borrarSocio(int id) {
		lista.remove(id);
	}
	
	public void cambiarNombre(int id, String nombre) {
		lista.get(id).setNombre(nombre);
	}
	
	public void mostrarTodo() {
		for (Socio print : lista) {
			System.out.println(print);
		}
	}
	
}
