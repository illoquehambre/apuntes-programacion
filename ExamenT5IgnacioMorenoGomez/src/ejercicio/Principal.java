package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="barco remolon", matricula, color, marca;
		int opcion=0, id=1, capacidad=350;
		List <Coche> lista=new ArrayList<Coche>();
		
		Barco br=new Barco(id,nombre, capacidad, lista);
		CrudBarco cr=new CrudBarco(br);
		cr.agregarCochesPredetermiando();
		
		System.out.println("Bienvenido a este programa.");
		do {
			System.out.println("\n\tPULSE\t\tPARA\n");
			System.out.println("\t0\t\tSALIR");
			System.out.println("\t1\t\tMOSTRAR TODO");
			System.out.println("\t2\t\tBUSCAR POR MATRICULA");
			System.out.println("\t3\t\tMODIFICAR COLOR");
			System.out.println("\t4\t\tORDENAR POR MATRICULA");
			System.out.println("\t5\t\tORDENAR POR COLOR");
			System.out.println("\t6\t\tBUSCAR COCHES POR MARCA");
			System.out.println("\t7\t\tCALCULAR RECAUDADO SI VENDE TODA UNA MARCA");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("Orden Actual");
				cr.getBr().mostrarTodo();
				break;
			case 2:
				
				matricula=Leer.dato();
				System.out.println(cr.buscarCocheMatricula(matricula));				
				break;
				
			case 3:
				System.out.println("Introduzca la matricula que desea buscar");
				
				matricula=Leer.dato();
				System.out.println("Introduzca el nuevo color");
				color=Leer.dato();
				cr.modifcarColor(matricula, color, br);
				cr.getBr().mostrarTodo();
				break;
				
			case 4:
				System.out.println("Orden Natural");
				Collections.sort(cr.getBr().getListado());
				cr.getBr().mostrarTodo();
				break;
			case 5:
				System.out.println("Orden no Natural");
				Collections.sort(cr.getBr().getListado(), new OrdenarColor());
				cr.getBr().mostrarTodo();
				break;
				
			case 6:
				System.out.println("Buscar Coche por marca");
				System.out.println("Introduzca la marca del coche que desea buscar");
				marca=Leer.dato();
				for (Coche co : cr.buscarCochesMarca(marca)) {
					System.out.println(co);
				}
				break;
				
			case 7:
				System.out.println("Mostrar recaudo si se vendiese toda una marca");
				marca=Leer.dato();
				System.out.println(cr.getBr().calcularMarcaVendida(marca));
				break;
				
			case 8:
				break;
				
			default:
					System.out.println("opcion incorrecta, intentelo de nuevo");
					break;
			}
		}while(opcion!=0);
	}

}
