package ejercicio_02_examen;

import java.util.Set;

public class Registro {
	
	Set <Venta> lista;

	public Registro(Set<Venta> lista) {
		super();
		this.lista = lista;
	}

	public Set<Venta> getLista() {
		return lista;
	}

	public void setLista(Set<Venta> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Ticket [lista=" + lista + "]";
	}
	
	
}
