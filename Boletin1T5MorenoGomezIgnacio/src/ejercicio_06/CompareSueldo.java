package ejercicio_06;

import java.util.Comparator;

public class CompareSueldo implements Comparator<Trabajador>{
	
	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		// TODO Auto-generated method stub
		if(o1.horasTrabajadas>o2.horasTrabajadas) {
			return 1;
		}else if(o1.horasTrabajadas<o2.horasTrabajadas){
			return -1;
		}else {
			return 0;
		}
	}

}
