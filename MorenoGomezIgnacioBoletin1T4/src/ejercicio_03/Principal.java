	package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=10, opcion=0, idTipo=0, cilindradas=0, contador=0, opcion1=0;
		double potencia=0, impuestos=0;
		String combustibleTipo;
		
		VehiculoMotor [] lista=new VehiculoMotor[tam];
		Gestion gestion=new Gestion(lista);
		
		
		do {
			System.out.println("Introduzca opcion");
			opcion=Leer.datoInt();
			switch(opcion) {
			
			case 0:
				System.out.println("FIN DEL PROGRAMA");
				break;
				
			case 1:
				System.out.println("Creación de vehículos");
				System.out.println("Introduzca la potencia en caballos del vehículo deseado");
				potencia=Leer.datoDouble();
				System.out.println("Introduzca las cilindradas del vehículo deseado");
				cilindradas=Leer.datoInt();
				System.out.println("Introduzca el tipo de combustible utilizado del vehículo deseado");
				combustibleTipo=Leer.dato();
				System.out.println("Introduzca el tipo de vehículo deseado");
				idTipo=Leer.datoInt();
				gestion.crearVehiculo(idTipo, contador, potencia, cilindradas, combustibleTipo);
				contador++;
				break;
				
			case 2:
				System.out.println("Introduzca la posición en la que se encuentra guaradado el vehículo");
				opcion1=Leer.datoInt();
				System.out.println(gestion.getLista()[opcion1]);
				break;
				
			case 3:
				System.out.println("Introduzca la posición en la que se encuentra guaradado el vehículo");
				opcion1=Leer.datoInt();
				System.out.println("Los impuestos de este vehículo son de "+gestion.getLista()[opcion1].calcularImpuestos()+"€");
			}
		}while(opcion!=0);
		
	}

}
