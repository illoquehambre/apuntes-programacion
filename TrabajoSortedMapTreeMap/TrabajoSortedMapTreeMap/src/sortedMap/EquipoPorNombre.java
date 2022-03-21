package sortedMap;

import java.util.Comparator;

public class EquipoPorNombre implements Comparator <Equipo> {
	public int compare(Equipo o1, Equipo o2) {
		return (o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()));
	}

}

