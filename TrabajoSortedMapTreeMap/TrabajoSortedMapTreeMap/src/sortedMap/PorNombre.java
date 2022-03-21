package sortedMap;

import java.util.Comparator;

public class PorNombre implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		return (o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
	}

}
