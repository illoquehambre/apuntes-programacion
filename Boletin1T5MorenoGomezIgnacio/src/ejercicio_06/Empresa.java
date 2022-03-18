package ejercicio_06;

import java.util.Iterator;
import java.util.List;

import ejercicio_04.Contacto;

public class Empresa {
	
	public List <Trabajador> lista;

	public Empresa(List<Trabajador> lista) {
		super();
		this.lista = lista;
	}

	public List<Trabajador> getLista() {
		return lista;
	}

	public void setLista(List<Trabajador> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Empresa [lista=" + lista + "]";
	}
	
	
}
