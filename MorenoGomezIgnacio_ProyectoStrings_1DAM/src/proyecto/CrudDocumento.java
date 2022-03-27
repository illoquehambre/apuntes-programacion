package proyecto;

import java.util.Iterator;

public class CrudDocumento {
	
	private Documento doc;

	public CrudDocumento(Documento doc) {
		super();
		this.doc = doc;
	}

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "CrudDocumento [doc=" + doc + "]";
	}
	
	
	
	public Seccion buscarPorNombre(int id) {
		Iterator <Seccion> it= doc.getLista().iterator();
		boolean encontrado=false;
		Seccion aux;
		while(it.hasNext()&&!encontrado) {
			aux=it.next();
			if(aux.getId()==id) {
				encontrado=true;
				return aux;
			}
			
		}
	return null;
	}
	
	
	public void agregarPorDefecto(String str, int limit) {
		for (int i = 0; i < limit; i++) {
			doc.getLista().add(new Seccion(str, i+1));
		}
		
	}
	
	public void agregarSeccion(int id, String str) {
		doc.getLista().add(new Seccion(str, id));
		}
	
	public void agregarTextoFinal(String nuevoTexto, Seccion actual) {
		StringBuilder stb=new StringBuilder();
		stb.append(actual.getTexto()).append(nuevoTexto);
		actual.setTexto(stb.toString());
	}
	
	public int mostrarIndice(String textoBuscado, Seccion actual){
		StringBuilder stb=new StringBuilder();
		stb.append(actual.getTexto());
		return stb.indexOf(textoBuscado);
	}
	
	public void agregarTextoPosicion(String nuevoTexto, Seccion actual, int init) {
		StringBuilder stb=new StringBuilder();
		stb.append(actual.getTexto());
		stb.insert(init, nuevoTexto);
		actual.setTexto(stb.toString());
	}
	
	public void eliminarTextoPosicion(Seccion actual, int init, int fin) {
		StringBuilder stb=new StringBuilder();
		stb.append(actual.getTexto());
		stb.delete(init, fin);
		actual.setTexto(stb.toString());
	}
	
	public void convertirPrimeraLetraMayuscula(Seccion actual) {
		char[] array=actual.getTexto().toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(i==0 || array[i-1]==' ') {
			array[i]= Character.toUpperCase(array[i]);
			
			}
			actual.setTexto(new String(array));
			
		}
	}
	
	public void ponerAlReves(Seccion actual) {
		StringBuilder stb=new StringBuilder();
		stb.append(actual.getTexto());
		stb.reverse();
		actual.setTexto(stb.toString());
	}
	
	public void sustituirCadenaDeCaracteres(Seccion actual, String nuevoTexto, String antiguoTexto) {
		actual.setTexto(actual.getTexto().replaceAll(antiguoTexto, nuevoTexto));
	}
	
	
}
