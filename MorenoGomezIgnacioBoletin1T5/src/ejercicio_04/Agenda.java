package ejercicio_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Agenda {
	
	private Map <Contacto, String> lista;

	public Agenda(Map<Contacto, String> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contacto, String> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(lista, other.lista);
	}
	
	
	public void agregarContactoCambiarTlf(Contacto contacto, String telefono) {
		lista.put(contacto, telefono);
	}
	public void borrarContacto(Contacto contacto, String telefono) {
		lista.remove(contacto, telefono);
	}
	public void mostrarTodo() {
		
	}
	
	public List <Contacto> buscarPorNombre(String nuevoNombre) {
		Iterator <Contacto> it = lista.keySet().iterator();
		Contacto tmp =null;
		List <Contacto> lista=new ArrayList<Contacto>();
		while(it.hasNext()) {
			tmp= it.next();
			if(tmp.getNombre().equalsIgnoreCase(nuevoNombre)) {
				lista.add(tmp);
			}
		}
		return lista;
	}
	
}
