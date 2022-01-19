package ejemploarraydeobjetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0, nVs=0, seguir=0;
		double potencia=0;
		String modelo;
		System.out.println("Introduce el tamaño del listado de Vehiculos");
		tam=Leer.datoInt();
		Vehiculo [] listado= new Vehiculo [tam];
		
		do {
			System.out.println("Introuce el modelo");
			modelo=Leer.dato();
			System.out.println("Introduce la potencia");
			potencia=Leer.datoDouble();
			listado	[nVs]=new Vehiculo(modelo, potencia);
			nVs++;
			System.out.println("Pulse 0 para salir o cualquier otro número para continuar");
			seguir=Leer.datoInt();
		}while(seguir !=0 && nVs<listado.length);	
		System.out.println();
		System.out.println("\tModelo\t\t\tPotencia");
		System.out.println("\t***********************************");
		for(int i=0;i<listado.length;i++) {
			System.out.println("\t"+listado[i].getModelo()+"\t\t"+listado[i].getPotencia());
		}
		
	}

}
