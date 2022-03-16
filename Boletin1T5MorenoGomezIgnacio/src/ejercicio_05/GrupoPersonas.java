package ejercicio_05;

import java.util.List;

public class GrupoPersonas {
	
	List <Persona> lista;

	public GrupoPersonas(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GrupoPersonas [lista=" + lista + "]";
	}
	
	public void agregarPersona(Persona pr) {
		lista.add(pr);
	}

	public void mostrarTodo() {
		for (Persona persona : lista) {
			System.out.println(persona);
		}
	}
	
}
