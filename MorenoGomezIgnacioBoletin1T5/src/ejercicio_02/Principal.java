package ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		double dinero=0;
		List <String> fechas=new ArrayList <String>();
		List <Socio> lista=new ArrayList <Socio>();
		gestionClub gest= new gestionClub(fechas, lista, dinero);
		
		
	}

}
