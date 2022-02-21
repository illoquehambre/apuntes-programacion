//Cuando haya que buscar por id del piso, mostrar previamente una lista de los mismos con sus caracteristicas


package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=10/*Pedir el tamaño por teclado al iniciar el programa */, opcion=0, id=0, pisosCreados=0, opcion1=0;
		double precioBase=0, metrosCuadrados=0, descuento=25, valorCambio=1.13, interesesInmo=7.5;
		String direccion;
		boolean reformable;
		Piso lista[]=new Piso[tam];
		Inmobiliaria inmo=new Inmobiliaria(lista);
		
		System.out.println("Bienvenido al portal de ventas de la inmobiliaria San Juan Bosco\n");
		
		do {
			System.out.println("\n\tPULSE\t\tPARA\n");
			System.out.println("\t[0]\t\tSALIR");
			System.out.println("\t[1]\t\tAGREGAR PISO");
			System.out.println("\t[2]\t\tPRECIO CON DESCUENTO DE UN PISO");
			System.out.println("\t[3]\t\tPRECIO METRO CUADRADO €");
			System.out.println("\t[4]\t\tPRECIO METRO CUADRADO $");
			System.out.println("\t[5]\t\tGANANCIAS DE LA INMOBILIARIA EN UN PISO");
			System.out.println("\t[6]\t\tGANACIAS DE LA INMOBILIARIA SI VENDIESE TODO");
			System.out.println("\t[7]\t\tMOSTRAR PISOS QUE NO NECESITAN REFORMA");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("FIN DEL PROGRAMA");
				break;
			case 1:
				if(pisosCreados<inmo.getLista().length) {
					System.out.println("Introduzca la direccion del piso");
					direccion=Leer.dato();
					System.out.println("Introduzca el precio inicial del piso");
					precioBase=Leer.datoDouble();
					System.out.println("Introduzca los metros cuadrados del piso");
					metrosCuadrados=Leer.datoDouble();
					System.out.println("Introduzca el número 0 si el piso necesita reformas o cualquier otro número si no es así.");
					opcion1=Leer.datoInt();
					if(opcion1==0) {//Hacer un método para este tipo de operaciones
						reformable=true;
					}else {
						reformable=false;
					}
					//En vez de llamr a todos los atributos en el método, instanciar un objetos(piso)auxiliar y 
					Piso aux=new Piso(direccion, precioBase , metrosCuadrados, reformable);
					inmo.agregarNuevoPiso(aux, pisosCreados);
					pisosCreados++;
				}else {
					System.out.println("Lo siento, no hay hueco para guardar más pisos");
				}
				
				break;
			case 2:
				System.out.println("Introduzca el id del piso que desee");
				System.out.println("Tenga en cuenta que los id empiezan desde 1 y no desde 0");
				id=Leer.datoInt()-1;
				if(id<pisosCreados&&id>=0) {
					System.out.printf("El precio con descuento es de %.2f €",inmo.calcularPrecioDescuento(id, descuento));
				}else {
					System.out.println("Lo sentimos, el piso que ha indicado no existe");
				}
				break;
			case 3:
				System.out.println("Introduzca el id del piso que desee");
				System.out.println("Tenga en cuenta que los id empiezan desde 1 y no desde 0");
				id=Leer.datoInt()-1;
				if(id<pisosCreados&&id>=0) {
					System.out.printf("El precio del metro cuadrado en euros es de %.2f €",inmo.getLista()[id].calcularPrecioMetroCuadrado());
				}else {
					System.out.println("Lo sentimos, el piso que ha indicado no existe");
				}
				break;
			case 4:
				System.out.println("Introduzca el id del piso que desee");
				System.out.println("Tenga en cuenta que los id empiezan desde 1 y no desde 0");
				id=Leer.datoInt()-1;
				if(id<pisosCreados&&id>=0) {
					System.out.printf("El precio del metro cuadrado en dólares es de %.2f $",inmo.calcularMetroCuadradoEnDolares(valorCambio, id));
				}else {
					System.out.println("Lo sentimos, el piso que ha indicado no existe");
				}
				break;
			case 5:
				System.out.println("Introduzca el id del piso que desee");
				System.out.println("Tenga en cuenta que los id empiezan desde 1 y no desde 0");
				id=Leer.datoInt()-1;
				if(id<pisosCreados&&id>=0) {
					System.out.printf("El precio del piso sin descuento es de %.2f €", inmo.getLista()[id].getPrecioBase());
					System.out.printf("\nCon un interés del %.2f €",interesesInmo);
					System.out.printf("\nLas ganacias de la inmobiliaria son de %.2f €",inmo.calcularGanancias(id, interesesInmo));
				}else {
					System.out.println("Lo sentimos, el piso que ha indicado no existe");
				}
				break;
			case 6:
				System.out.printf("Las ganacias de la inmobiliaria serian de %.2f €", inmo.calcularMaxGanaciasPosible(interesesInmo));
				break;
			case 7:
				inmo.mostrarNoReformables(pisosCreados);
				break;
			default:
				System.out.println("Opción no disponible, por favor intentelo de nuevo");
			}
		}while(opcion!=0);
	}

}
