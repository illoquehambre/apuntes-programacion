package ejercicio_05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int opcion=0, id=0;
		
		char consumo;
		String color;
		double peso=0, precioBase=0;
		Electrodomestico[] lista= new Electrodomestico[10];
		Tienda tienda= new Tienda(lista);
		System.out.println("Bienvenido a la tienda de electrodomésticos\n\n");
		do {
			System.out.println("\tPulse\t\tPara\n");
			System.out.println("\t0\t\tSALIR");
			System.out.println("\t1\t\tGENERAR UN NUEVO PRODUCTO INTRODUCIENDO SUS DATOS");
			System.out.println("\t2\t\tGENERAR NUEVO PRODUCTO CON ALGUNOS VALORES POR DEFECTO");
			System.out.println("\t3\t\tGENERAR UN NUEVO PRODUCTO CON VALORES POR DEFECTO");
			System.out.println("\t4\t\tCALCULAR EL PRECIO DE UN DETERMINADO PRODUCTO");
			System.out.println("\t5\t\tCALCULAR LA SUMA DE PRECIOS DE PRODUCTOS");
			System.out.println("\t6\t\tCALCULAR LA MEDIA DE PRECIOS");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("FIN DEL PROGRAMA");
				break;
			case 1:
				System.out.println("Introduzca el peso");
				peso=Leer.datoDouble();
				System.out.println("Introduzca el precio inicial del producto");
				precioBase=Leer.datoDouble();
				System.out.println("Introduzca el consumo en una letra mayuscula entre A y F");
				consumo=Leer.datoChar();
				System.out.println("Introduzca el color que desee, en caso de que no esté disponible se le asignará uno por defecto");
				color=Leer.dato();
				tienda.getLista()[id]=new Electrodomestico(precioBase,color,consumo,peso);
				tienda.getLista()[id].comprobarColor();
				tienda.getLista()[id].comprobarConsumoEnergetico();	
				id++;
				break;
				
			case 2:
				System.out.println("Introduzca el peso");
				peso=Leer.datoDouble();
				System.out.println("Introduzca el precio inicial del producto");
				precioBase=Leer.datoDouble();
				tienda.getLista()[id]=new Electrodomestico(precioBase,peso);
				id++;
				break;
			case 3:
				tienda.getLista()[id]=new Electrodomestico();
				id++;
				break;
			case 4:
				System.out.println("Introduzca el id del producto que quiera observar");
				opcion=Leer.datoInt();
				System.out.println(" El precio del producto elegido es: "+tienda.calcularPrecioConcreto(opcion)+"€");
				break;
			case 5:
				System.out.println("Introduzca el id del producto que quiera observar");
				opcion=Leer.datoInt();
				System.out.println("El precio total de todos los preoductos es: "+tienda.calcularPrecioTotal());
				break;
				
			case 6:
				System.out.println("Introduzca el id del producto que quiera observar");
				opcion=Leer.datoInt();
				System.out.println("La media del precio de todos los productos es: "+tienda.calcularMedia()+"€");
				break;
			}
		}while(opcion!=0);
		
		
	}

}
