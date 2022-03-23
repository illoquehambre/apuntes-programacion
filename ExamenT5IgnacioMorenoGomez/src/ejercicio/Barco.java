package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Barco {
	
	private int id;
	private String nombre;
	private int capacidadCarga;
	List <Coche> listado;
	public Barco(int id, String nombre, int capacidadCarga, List<Coche> listado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidadCarga = capacidadCarga;
		this.listado = listado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public List<Coche> getListado() {
		return listado;
	}
	public void setListado(List<Coche> listado) {
		this.listado = listado;
	}
	@Override
	public String toString() {
		return "Barco [id=" + id + ", nombre=" + nombre + ", capacidadCarga=" + capacidadCarga + ", listado=" + listado
				+ "]";
	}
	
	
	
	
	
	
	
	
	public double calcularMarcaVendida(String marca) {

		double precioFin=0;
		for (Coche co : listado) {
			if(co.getMarca().equalsIgnoreCase(marca)) {
				precioFin=precioFin+co.getPrecio();
			}
		}		
		return precioFin;
	}
	
	public void mostrarTodo() {
		Iterator<Coche> it = listado.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
	
}
