package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreAe="Aeropuerto remolón";
		int tam=10, id=0, contador=0, limitMotores=4, opcion=0;
		double precioTam=2, limiteCombust=20000, precExtra=100, porcMotores=20, precMisil=10;
		System.out.println("Bienvenido al programa del "+nombreAe);
		Avion[] lista=new Avion[tam];
		Aeropuerto ae=new Aeropuerto(nombreAe, lista);
		
		ae.getLista()[contador++]=new Avion(34, 20012, contador, 2000);
		ae.getLista()[contador++]=new CazaMilitar(16, 2002, contador, 25000, 2000, 7);
		ae.getLista()[contador++]=new NaveEspacial(98, 20016, contador, 42000, 8);
		ae.getLista()[contador++]=new CazaMilitar(16, 2002, contador, 25000, 1500, 4);
		ae.getLista()[contador++]=new NaveEspacial(98, 2000, contador, 42000, 3);
		
		do {
			System.out.println("\n\tINTRODUZCA\t\tPARA");
			System.out.println("\t**************************************************************");
			System.out.println("\t0\t\t\tSALIR DEL PROGRAMA");
			System.out.println("\t1\t\t\tCALCULAR PRECIO ATERRIZAJE DE UN AVIÓN");
			System.out.println("\t2\t\t\tCALCULAR RECAUDADO EN CAZAS");
			System.out.println("\t3\t\t\tCALCULAR TOTAL RECAUDADO");
			System.out.println("\t4\t\t\tMOSTRAR DATOS REGISTRADOS");
			System.out.println("\t**************************************************************");
			opcion=Leer.datoInt();
			switch(opcion) {
				
			case 0:
				System.out.println("Gracias por utilizar este programa.");
				System.out.println("Fin del programa.");
				break;
				
			case 1:
				ae.mostrarTodo(contador);
				System.out.println("\nIntroduzca el número identificativo (id) del avión que desee");
				id=Leer.datoInt()-1;
				if(id<0||id>=contador) {
					System.out.println("Lo sentimos, el id introducido no es válido."
							+ "\nIntentelo de nuevo.");
				}else {
					System.out.printf("%.2f €",ae.calcularAterrizajeUnAvion(id, precioTam, limiteCombust, precExtra, porcMotores, limitMotores, precMisil));
				}
				
				break;
			case 2:
				System.out.printf("%.2f €",ae.calcularRecaudadoCazas(contador, precioTam, limiteCombust, precExtra, porcMotores, limitMotores, precMisil));
				break;
			case 3:
				System.out.printf("%.2f €",ae.calcularTotalRecaudado(contador, precioTam, limiteCombust, precExtra, porcMotores, limitMotores, precMisil));
				break;
			case 4:
				ae.mostrarTodo(contador);
				break;
			default:
				System.out.println("ERROR. La opción seleccionada no existe, \nIntentelo de nuevo");
			}
		}while(opcion!=0);
		
		
		
		
		
		
		
		
		
	}

}
