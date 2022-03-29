package ejemplo_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0, min=30, max=120;
		String nombre= "Luchador";
		Random num=new Random (System.nanoTime());
		Luchador luchador;
		List <Luchador> lista =new ArrayList<Luchador>();
		
		
		Supplier <Double> crearRandom = () -> min + (max-min)* num.nextDouble();
		Supplier <Luchador> generarLuchador = () -> new Luchador("", crearRandom.get(), crearRandom.get(), 
				crearRandom.get(), crearRandom.get(), crearRandom.get());
	}

}
