package proyecto;

import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;


public class Documento {
	private List <Seccion> lista;

	public Documento(List<Seccion> lista) {
		super();
		this.lista = lista;
	}

	public List<Seccion> getLista() {
		return lista;
	}

	public void setLista(List<Seccion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hoja [lista=" + lista + "]";
	}
	
	
	
	
	
	public void mostrarTodo() {
		String delimitador="\n\n", prefijo="Documento:\n\n", sufijo="\n\n\\(^-^)/\\(^-^)/";
		StringJoiner join=new StringJoiner(delimitador, prefijo, sufijo);
		for (Seccion sc : lista) {
			join.add(sc.getTexto());
		}
		System.out.println(join);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
