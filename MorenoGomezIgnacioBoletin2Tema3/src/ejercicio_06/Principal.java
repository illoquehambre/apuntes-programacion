package ejercicio_06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO ApÃ©ndice de mÃ©todo generado automÃ¡ticamente
		
		int fila=1, butaca=1, idAsiento=1, idSala=1, opcion=0;
		double precioEntrada;

		Sala sala= new Sala(idSala);
		idSala++;
		for(int i=0;i<sala.getAsientos().length;i++) {
			for(int j=0;j<sala.getAsientos()[i].length;j++) {
				sala.getAsientos()[i][j]=new Entrada(idAsiento, j, i);
				idAsiento++;
			}
		}


		do {
			System.out.println("\tPulse\t\tPara");
			System.out.println("\t******************************************");
			System.out.println("\t0\t\tSALIR");
			System.out.println("\t1\t\tCOMPRAR ENTRADA");
			System.out.println("\t2\t\tCALCULAR GANACIAS DEL DIA");
			System.out.println("\t3\t\tCAMBIAR PRECIO ENTRADAS");
			System.out.println("\t4\t\tMOSTRAR CARTELERA");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 0: 
					System.out.println(" FIN DEL PROGRAMA");
					break;
				case 1:
					fila=Leer.datoInt();
					butaca=Leer.datoInt();
					if(sala.getAsientos()[butaca][fila].isdisponible()) {
						System.out.println("El coste de la entrada es: "+sala.getAsientos()[butaca][fila].getPrecio()+"â‚¬");
						sala.comprarEntrada(butaca, fila);
						System.out.println("El asiento numero "+sala.getAsientos()[butaca][fila].getId()+" ha sido comprado exitosamente");
						
						break;
					}else {
						System.out.println("Lo siento, este asiento ya se encuentra ocupado");
					}
				case 2: 
					System.out.println("Las ganancias totales del dia son: "+sala.getDineroRecaudado()+"â‚¬");
					break;
				case 3: 
					fila=Leer.datoInt();
					butaca=Leer.datoInt();
					System.out.println("El coste actual de la entrada es: "+sala.getAsientos()[butaca][fila].getPrecio()+"€");
					precioEntrada=Leer.datoDouble();
					sala.getAsientos()[butaca][fila].setPrecio(precioEntrada);
					System.out.println("El nuevo coste de la entrada es de: "+sala.getAsientos()[butaca][fila].getPrecio()+"€");
					break;
				case 4:
					sala.mostrarCartelera();
					break;
				default: 
						System.out.println("Opcion no disponible, por favor intentelo de nuevo");
				}
		}while(opcion!=0);
	}

}
