package ejercicio_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, direccion, telefono;
		int opcion=0;
		List <Persona> lista=new ArrayList();
		GrupoPersonas gr=new GrupoPersonas(lista);
		
		gr.agregarPersona(new Persona("arturo", "ncencnewcvnewv", "151914151"));
		gr.agregarPersona(new Persona("durban", "ncencnewcvnewv", "749845615"));
		gr.agregarPersona(new Persona("mario", "ncencnewcvnewv", "987446111"));
		gr.agregarPersona(new Persona("alvaro", "ncencnewcvnewv", "84156125184"));
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("introdusca opsion");
			opcion=Leer.datoInt();
			switch(opcion) {
			
			case 0:
				System.out.println("Fin del programa");
				break;
				
			case 1:
				System.out.println("vamoh a agregar");
				System.out.println("nombre:");
				nombre=Leer.dato();
				System.out.println("direccion:");
				direccion=Leer.dato();
				System.out.println("telefono:");
				telefono=Leer.dato();
				gr.agregarPersona(new Persona(nombre, direccion, telefono));
				break;
			case 2:
				System.out.println("vamoh a mostrar sin ordenar");
				gr.mostrarTodo();
				break;
				
			case 3:
				System.out.println("orden natural");
				Collections.sort(gr.getLista());
				gr.mostrarTodo();
				break;
				
			case 4:
				System.out.println("orden NO natural");
				Collections.sort(gr.getLista(), new CompareNombre());
				gr.mostrarTodo();
				break;
				
			}
			
		}while(opcion!=0);
	}

}
