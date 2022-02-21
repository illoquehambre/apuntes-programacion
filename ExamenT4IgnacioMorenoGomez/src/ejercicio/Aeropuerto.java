package ejercicio;

import java.util.Arrays;

public class Aeropuerto {
	
	private String nombre;
	private Avion[] lista;
	
	
	public Aeropuerto(String nombre, Avion[] lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Avion[] getLista() {
		return lista;
	}
	public void setLista(Avion[] lista) {
		this.lista = lista;
	}
	
	
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	public double  calcularAterrizajeUnAvion
	(int id, double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		
		return lista[id].calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores, precMisil);
	}
	
	
	public void mostrarTodo(int contador) {
		for(int i=0;i<contador;i++) {
			if(lista[i] instanceof NaveEspacial) {
				System.out.print("\n"+lista[i]);
				((NaveEspacial)lista[i]).avisarExtraterrestres();
			}else {
				System.out.println("\n"+lista[i]);
			}
		}
		
	}
	
	public double calcularRecaudadoCazas
	(int contador, double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		double total=0;
		for(int i=0;i<contador;i++) {
			if(lista[i] instanceof CazaMilitar) {
				total=total+ lista[i].calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores, precMisil);
			}
		}
		return total;
	}
	
	public double calcularTotalRecaudado
	(int contador, double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		double total=0;
		for(int i=0;i<contador;i++) {
			total=total+ lista[i].calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores, precMisil);
		}
		return total;
	}
	
	
	
}
