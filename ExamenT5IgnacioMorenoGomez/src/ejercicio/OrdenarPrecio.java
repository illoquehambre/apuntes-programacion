 package ejercicio;

import java.util.Comparator;

public class OrdenarPrecio implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		// TODO Auto-generated method stub
		if(o1.getPrecio()<o2.getPrecio()) {
			return 1;
		}else if(o1.getPrecio()>o2.getPrecio()){ 
			return -1;
		}else {
			return 0;
		}
	}

}
