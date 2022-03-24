package proyecto;

import java.util.Iterator;
import java.util.List;


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
	
	public void convertirPrimeraLetraMayuscula(String nuevoNombre) {
		char[] array=this.buscarPorNombre(nuevoNombre).getTexto().toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(i==0 || array[i-1]==' ') {
			array[i]= Character.toUpperCase(array[i]);
				
			}
			
		}
	}
	
	public void sustituirCadenaDeCaracteres(String nuevoNombre, String nuevoTexto, String antiguoTexto) {
		this.buscarPorNombre(nuevoNombre).getTexto().replaceAll(antiguoTexto, nuevoTexto);
	}
	
	
	public void eliminarCadenaDeCaracteres(String nuevoNombre, String nuevoTexto, int ini, int fin) {
		StringBuffer stb=new StringBuffer();
		Seccion str=this.buscarPorNombre(nuevoNombre);
		stb.append(str.getTexto());
		stb.delete(ini, fin);
		str.setTexto(stb.toString()); 
		
	}
	
	public void ponerAlReves(String nuevoNombre) {
		StringBuffer stb=new StringBuffer();
		Seccion str=this.buscarPorNombre(nuevoNombre);
		stb.append(this.buscarPorNombre(nuevoNombre).getTexto());
		stb.reverse();
		str.setTexto(stb.toString());
	}
	
	
}
