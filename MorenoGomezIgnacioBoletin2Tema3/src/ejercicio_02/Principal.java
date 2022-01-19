package ejercicio_02;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		double[] precios={0,25,45,75,125,450};
		int maxServicios=200, minServicios=0, maxNoches=30, minNoches=0;
		Habitacion listado[]= new Habitacion[10];
		Hotel h=new Hotel(listado);
		
		for(int i=0;i<listado.length;i++) {
			Random random=new Random();
			listado[i]=new Habitacion(random.nextInt((listado.length-1+1)+1), precios, "Vacio",0, 0);
		}
		
		System.out.println("Bienvenido al Hotel Maquelele\n");
		
		do {
			System.out.println("Elija opcion");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("Elija opcion");
				opcion=Leer.datoInt();
				h.mostrarFactura(listado[opcion], maxServicios, minServicios);
				break;
			case 1:
			}
		}while(opcion!=0);
	}

}
