package sortedMap;

import java.util.Comparator;

public class PorEquipo implements Comparator<Equipo> {

	public int compare(Equipo c1, Equipo c2) {

		double marca1 = c1.getPuntosTotales();
		double marca2 = c2.getPuntosTotales();

		if (marca1 < marca2) {
			return 1;

		} else {
			if (marca1 > marca2) {
				return -1;
			}
			return 0;
		}
	}
}
