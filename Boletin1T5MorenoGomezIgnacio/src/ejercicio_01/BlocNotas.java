package ejercicio_01;

import java.util.List;

public class BlocNotas {
	
	
	private List <Nota>	lista;

	public BlocNotas(List<Nota> lista) {
		super();
		this.lista = lista;
	}
	
	public void agregar(Nota nota) {
		lista.add(nota);
	}
	
	public void mostraUna(int aux) {
		if(this.comprobarTam(aux)) {
			System.out.println(lista.get(aux));
		}
	}
	
	public boolean comprobarTam(int aux) {
		if(aux>0||aux<lista.size()) {
			return true;
		}else {
			this.mostrarNoEncontrado();
			return false;
		}
	}
	public void mostrarNoEncontrado() {
		System.out.println("El índice introducido no se ha encontrado, inténtelo de nuevo");
	}
	
	public void mostrarTamanio() {
		
		System.out.println(lista.size());
	}
	public void eliminarUno(int aux) {
		if(this.comprobarTam(aux)) {
			System.out.println(lista.remove(aux));
		}
		
	}
}
