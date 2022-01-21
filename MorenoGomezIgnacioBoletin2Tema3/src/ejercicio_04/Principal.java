package ejercicio_04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=10, clientesGuardados=0, opcion=0, id=0;
		String dni, nombre, apellidos;
		double peso=0, altura=0;
		Cliente[] listaCliente=new Cliente[tam];
		Gimnasio gym=new Gimnasio(listaCliente);
		
		opcion=Leer.datoInt();
		do{
			switch(opcion) {
			case 0:
				System.out.println("Cerrando el programa");
				break;
			case 1:
				if(clientesGuardados<listaCliente.length) {
					System.out.println("Introduzca su dni: ");
					dni=Leer.dato();
					System.out.println("Introduzca su nombre: ");
					nombre=Leer.dato();
					System.out.println("Introduzca su apellidos: ");
					apellidos=Leer.dato();
					System.out.println("Introduzca su peso: ");
					peso=Leer.datoDouble();
					System.out.println("Introduzca su altura: ");
					altura=Leer.datoDouble();
					listaCliente[clientesGuardados]=new Cliente(dni, nombre, apellidos, true, peso, altura);
					clientesGuardados++;
				}else {
					System.out.println("Lo siento el gimnasio tiene todas sus plazas ocupadas."
							+ "\nVuelva otro mes.");
				}
				
				break;
			case 2:
				System.out.println("Introduzca el identificador del cliente:");
				id=Leer.datoInt()-1;
				System.out.println("Su imc es: "+ listaCliente[id].calcularIMC());
				break;
			
			}
		}while(opcion!=0);
	}

}
