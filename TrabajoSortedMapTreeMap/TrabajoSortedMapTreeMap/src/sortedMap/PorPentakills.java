package sortedMap;

import java.util.Comparator;

public class PorPentakills implements Comparator <Equipo> {
	public int compare(Equipo c1, Equipo c2) {

		double marca1 = c1.getCantPentakill();
		double marca2 = c2.getCantPentakill();

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
