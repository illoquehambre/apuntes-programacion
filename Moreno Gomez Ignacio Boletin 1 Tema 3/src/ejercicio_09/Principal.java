package ejercicio_09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  menu=0, contrasenia=1234, nViajes=0;;
		double precio=0;
		Ticket t1=new Ticket(15);
		Machine machine=new Machine(contrasenia, 0);
		
		System.out.println("Iniciando el programa de venta de tickets");
		do {
			System.out.println("Por favor introduzca la contraseña de administrador:");
			contrasenia=Leer.datoInt();
			
		}while(!machine.comprobarContraseña(contrasenia, machine, t1));
		
		do {
			System.out.println("\n\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			System.out.println("\t*\tPulse\t\tPara\t\t\t\t*");
			System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			System.out.println("\t*\t0\t\tSalir\t\t\t\t*");
			System.out.println("\t*\t1\t\tCambiar el precio de los tickets*");
			System.out.println("\t*\t2\t\tVender tickets\t\t\t*");
			System.out.println("\t*\t3\t\tCambiar contraseña\t\t*");
			System.out.println("\t*\t4\t\tConsultar Saldo\t\t\t*");
			System.out.println("\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			menu=Leer.datoInt();
			switch(menu) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("Indique el nuevo precio de los tickets");
				precio=Leer.datoDouble();
				t1.setPrecioUd(precio);
				break;
			case 2:
				System.out.println("\t\tCompra de tickets");
				System.out.println("¿Cuántos viajes quiere comprar?");
				nViajes=Leer.datoInt();
				machine.comprarTicket(t1, nViajes);
				break;
				
			case 3:
				System.out.println("Introduzca la nueva contraseña:");
				contrasenia=Leer.datoInt();
				machine.setContrasenia(contrasenia);
				break;
			case 4:
				System.out.println(machine.getRecaudoDiario()+" €");
				break;
			}
		}while(menu!=0);
	}

}
