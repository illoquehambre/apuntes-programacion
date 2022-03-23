package hasmap_to_treemap;

import java.util.Comparator;
import java.util.Map;

public class PorNombre implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareToIgnoreCase(o2);
	}

	

}
