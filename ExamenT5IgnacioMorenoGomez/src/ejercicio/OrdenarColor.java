package ejercicio;

import java.util.Comparator;

public class OrdenarColor implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		// TODO Auto-generated method stub
		return o1.getColor().compareToIgnoreCase(o2.getColor());
	}

}
