package ejercicio_05;

import java.util.Comparator;

public class CompareNombre implements Comparator<Persona>{

	@Override//metodo de ordenación NO natural
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return (o1.getNombre().compareToIgnoreCase(o2.getNombre()));
	}

}
