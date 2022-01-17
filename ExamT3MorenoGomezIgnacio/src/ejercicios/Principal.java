package ejercicios;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0, desde=0, hasta=0, mediaLitros=0;
		double radio=0, altura=0, volumen=0, porcentajeBenef=0, costeFabricacion=2000, precioVenta=0;
		int[] litrosPorDia=new int[7];
		Deposito d1;
		GestionPlataforma pl1=new GestionPlataforma();;
		
		System.out.println("Bienvenido al programa de la plataforma petrolífeca");
		do {
			System.out.println("\n\n\tPulse\t\tPara\n");
			System.out.println("\t1\t\tCalcular Volumen del depósito");
			System.out.println("\t2\t\tCalcular los litros almacenados por dia");
			System.out.println("\t3\t\tCalcular el precio de venta del depósito");
			System.out.println("\t4\t\tCalcular la media de litros por dia");
			System.out.println("\t5\t\tObservar las características del depósito");
			System.out.println("\t0\t\tSALIR");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0: 
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("Introduzca el radio");
				radio=Leer.datoDouble();
				System.out.println("Introduzca la altura");
				altura=Leer.datoDouble();
				d1=new Deposito(altura, radio);
				
				volumen=pl1.calcularVolumen(d1);
				System.out.println("El volumen del depósito es de "+volumen);
				
				break;
			case 2:
				hasta=(int) (volumen);
				if(volumen==0) {
					System.out.println("ERROR. El volumen todavía no ha sido calculado");
				}else {
					litrosPorDia=pl1.litrosPorDiaDeLaSemana(volumen, desde, hasta);
					for(int i=0;i<litrosPorDia.length;i++) {
						System.out.println("Día "+i+1+": "+litrosPorDia[i]);
					}
				}
			
				break;
			case 3:
				System.out.println("Introduzca el porcentaje de beneficio que desea");
				porcentajeBenef=Leer.datoDouble();
				d1=new Deposito(altura, radio, costeFabricacion);
				precioVenta=pl1.calcularPrecioVenta(d1, porcentajeBenef);
				System.out.println("El precio de venta del producto es de: "+precioVenta);
				
				break;
			case 4:
				mediaLitros=pl1.mediaLitrosPorDia(litrosPorDia);
				System.out.println("La media de litros en esta semana es de: "+mediaLitros+" por día.");
				break;
			case 5:
				d1=new Deposito(altura, radio, costeFabricacion);
				System.out.println("\t Altura: "+altura);
				System.out.println("\t Radio: "+radio);
				System.out.println("\t Coste de fabricación: "+costeFabricacion);
				System.out.println("\tVolumen: "+volumen);
				System.out.println("\tPrecio venta: "+precioVenta);
				break;
			}
		}while(opcion!=0);
	}

}
