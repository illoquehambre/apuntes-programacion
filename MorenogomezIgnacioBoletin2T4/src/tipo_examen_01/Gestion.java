package tipo_examen_01;

import java.util.Arrays;

public class Gestion {
	
	private Habitacion[] lista;

	public Gestion(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public double calcularTodo(int contador, double descuento, double precio) {
		double total=0;
		for(int i=0;i<contador;i++){
			if(lista[i].isOcupacion()) {
				total=total+this.calcularUnoConcreto(i, precio, descuento);
			}
		}
		return total;
	}
	
	public double calcularUnoConcreto(int id, double precio, double descuento) {
		return lista[id].calcularPrecioFinal(precio, descuento);
	}
}
