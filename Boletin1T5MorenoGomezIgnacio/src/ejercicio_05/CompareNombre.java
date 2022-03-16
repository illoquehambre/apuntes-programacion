package ejercicio_05;

import java.util.Comparator;

public class CompareNombre implements Comparator<Persona>{//comparator va en la clase externa porque es un orden NO natural

	@Override//metodo de ordenación NO natural
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return (o1.getNombre().compareToIgnoreCase(o2.getNombre()));
		
		
	}
	

}
