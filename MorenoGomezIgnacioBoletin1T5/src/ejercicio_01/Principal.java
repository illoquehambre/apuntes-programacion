package ejercicio_01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=0, opcion=0, aux=0;
		String cabecera, cuerpo;
		boolean fav;
		Nota nuevaNota;
		 List <Nota>lista=new ArrayList<Nota>();
		 BlocNotas bn=new BlocNotas(lista);
		 
		 do {
			 System.out.println("Introduzca opcion");
			 opcion=Leer.datoInt();
			 switch(opcion) {
			 case 0:
				 break;
			 case 1:
				 id++;
				 System.out.print("\nCabecera:");
				 cabecera=Leer.dato();
				 System.out.print("\nCuerpo:");
				 cuerpo=Leer.dato();
				 System.out.println("\nPulse 1 si es urgente o cualquier otro número si no:");
				 aux=Leer.datoInt();
				 if(aux==1) {
					 fav=true;
				 }else {
					 fav=false;
				 }
				 nuevaNota=new Nota(id, cabecera, cuerpo, fav);
				 bn.agregar(nuevaNota);
				 break;
				 
			 case 2:
				 System.out.println("Introduzca el índice de la nota que deseea mostrar");
				 aux=Leer.datoInt()-1;
				 bn.mostraUna(aux);
				 break;
				 
			 case 3:
				 System.out.println(lista);
				 break;
			 case 4:
				 System.out.print("Total notas: ");
				 bn.mostrarTamanio();
				 break;
			 case 5:
				 System.out.println(lista);
				 System.out.println("Introduzca el índice de la nota que deseea eliminar");
				 aux=Leer.datoInt()-1;
				 bn.eliminarUno(aux);
				 break;
			 }
		 }while(opcion!=0);
		
		
	}

}
