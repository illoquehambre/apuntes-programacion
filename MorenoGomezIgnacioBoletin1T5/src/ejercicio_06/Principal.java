package ejercicio_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		List <Trabajador> lista= new ArrayList();
		Empresa emp=new Empresa(lista);
		
		emp.getLista().add(new Trabajador("Manolo", "8541654984D", 41, 7485));
		emp.getLista().add(new Trabajador("Luis", "688748464657R", 24, 68741));
		emp.getLista().add(new Trabajador("Javier", "8541654984J", 84, 7288));
		emp.getLista().add(new Trabajador("Luismi", "476454654H", 3, 185));
		
		
		do {
			System.out.println("Mete una opción");
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				System.out.println("fin del programa");
				break;
				
			case 1:
				emp.mostrarTodo();
				break;
				
			case 2:
				System.out.println("Orden natural (horas trabajadas)");
				Collections.sort(emp.getLista());
				//Desde la clase Madre Collections llamamos a su método Sort
				//Dentro de este indicamos a la lista que es atributo de nuestra clase
				emp.mostrarTodo();//Mostramos el nuevo orden
				break;
				
			case 3:
				System.out.println("Orden NO natural (sueldo)");
				Collections.sort(emp.getLista(), new CompareSueldo());
				//Igual que antesd pero instanciamos una clase (CompareSueldo)
				//Esta clase creada por nosotros tiene ujn nuevo criterio de ordenación dentro.
				emp.mostrarTodo();//Mostramos el nuevo orden
				break;
			}
			
		}while(opcion!=0);
	}

}
