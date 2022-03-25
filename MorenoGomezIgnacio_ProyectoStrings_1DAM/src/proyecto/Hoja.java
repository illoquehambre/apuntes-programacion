package proyecto;

import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;


public class Hoja {
	private List <Seccion> lista;

	public Hoja(List<Seccion> lista) {
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
	
	public Seccion buscarPorNombre(String nuevoNombre) {
		Iterator <Seccion> it= lista.iterator();
		boolean encontrado=false;
		Seccion aux;
		while(it.hasNext()&&!encontrado) {
			aux=it.next();
			if(aux.getNombre().equalsIgnoreCase(nuevoNombre)) {
				encontrado=true;
				return aux;
			}
			
		}
	return null;
	}
	
	public void convertirPrimeraLetraMayuscula(Seccion actual) {
		char[] array=actual.getTexto().toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(i==0 || array[i-1]==' ') {
			array[i]= Character.toUpperCase(array[i]);
				
			}
			
		}
	}
	
	public void sustituirCadenaDeCaracteres(Seccion actual, String nuevoTexto, String antiguoTexto) {
		actual.getTexto().replaceAll(antiguoTexto, nuevoTexto);
	}
	
	
	public void eliminarCadenaDeCaracteres(Seccion actual, String nuevoTexto, int ini, int fin) {
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto());
		stb.delete(ini, fin);
		actual.setTexto(stb.toString()); 
		
	}
	
	public void ponerAlReves(Seccion actual) {
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto());
		stb.reverse();
		actual.setTexto(stb.toString());
	}
	
	public void mostrarTodo() {
		String delimitador="\n\n", prefijo="\t- ", sufijo="\\(^-^)/\\(^-^)/";
		StringJoiner join=new StringJoiner(delimitador, prefijo, sufijo);
		for (Seccion sc : lista) {
			join.add(sc.getTexto());
		}
		System.out.println(join);
	}
	
	public void agregarTextoFinal(String nuevoTexto, Seccion actual) {
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto()).append(nuevoTexto);
		actual.setTexto(stb.toString());
	}
	
	public void agregarTextoPosicion(String nuevoTexto, Seccion actual, int init) {
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto());
		stb.insert(init, nuevoTexto);
		actual.setTexto(stb.toString());
	}
	
	public void eliminarTextoPosicion(Seccion actual, int init, int fin) {
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto());
		stb.delete(init, fin);
		actual.setTexto(stb.toString());
	}
	
	public int mostrarIndice(String textoBuscado, Seccion actual){
		StringBuffer stb=new StringBuffer();
		stb.append(actual.getTexto());
		return stb.indexOf(textoBuscado);
	}
	
	

}
