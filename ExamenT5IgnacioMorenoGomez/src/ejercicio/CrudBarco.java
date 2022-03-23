package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CrudBarco {
	
	private Barco br;
	
	
	
	public CrudBarco(Barco br) {
		super();
		this.br = br;
	}

	public Barco getBr() {
		return br;
	}

	public void setBr(Barco br) {
		this.br = br;
	}

	public void modifcarColor(String matricula, String color, Barco br) {
		Iterator<Coche> it = br.getListado().iterator();
		boolean encontrado=false;
		Coche aux;
		while(it.hasNext() && !encontrado) {
			aux=it.next();
			if(aux.getMatricula().equalsIgnoreCase(matricula)) {
				aux.setColor(color);
			}
		}
	}
	
	public List<Coche> buscarCochesMarca(String marca){
		List <Coche> aux=new ArrayList<Coche>();
		for (Coche co : br.listado) {
			if(co.getMarca().equalsIgnoreCase(marca)) {
				aux.add(co);
			}
		}
		return aux;
		
	}
	public Coche buscarCocheMatricula(String matricula) {
		Iterator<Coche> it = br.getListado().iterator();
		boolean encontrado=false;
		Coche aux;
		while(it.hasNext() && !encontrado) {
			aux=it.next();
			if(aux.getMatricula().equalsIgnoreCase(matricula)) {
				encontrado=true;
				return aux;
			}
		}
		return null;
	}
	
	public void agregarCochesPredetermiando() {
		br.getListado().add(new Coche("24644VRWV", "Citroen", "C-3", "Cian", 14500));
		br.getListado().add(new Coche("514564RBSR", "Audi", "A-12", "negro", 20700));
		br.getListado().add(new Coche("44564VSDVS", "Mercedes", "Benz", "verde", 17500));
		br.getListado().add(new Coche("564874NTYU", "Citroen", "C-4", "rojo", 15000));
		
	}
	
	/*public void buscarMasCaros() {
		Collections.sort(br.getListado(), new OrdenarPrecio());
		Iterator<Coche> it = br.getListado().iterator();
		boolean fin=false;
		Coche aux;
		List <Coche> lista=new ArrayList<Coche>();
		while(it.hasNext() && !fin) {
			aux=it.next();
			if(aux.getPrecio()==it.next().getPrecio()) {
				
			}
		}
	}*/   
	
}
