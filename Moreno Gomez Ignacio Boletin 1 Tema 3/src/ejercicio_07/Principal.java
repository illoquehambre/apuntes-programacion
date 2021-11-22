package ejercicio_07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		double saldo=0;
		String titular;
		Cuenta_corriente c1;
		System.out.println("Introduzca el nombre del titular de la cuenta");
		titular=Leer.dato();
		System.out.println("Bienvenido "+titular);
		c1 = new Cuenta_corriente(saldo, titular);
		do {
			System.out.println("\n\tPulse\t\tPara");
			System.out.println("\n\t0\t\tSalir");
			System.out.println("\t1\t\tIntroducir dinero");
			System.out.println("\t2\t\tRetirar dinero");
			System.out.println("\t3\t\tConsultar saldo en dólares Americanos($)");
			System.out.println("\t4\t\tConsultar saldo en euros(€)");
			menu=Leer.datoInt();
			switch(menu) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.println("Introduzca una cantidad entera de dinero para ingresarla: ");
				c1.ingresarDinero(menu);
				break;
			case 2:
				System.out.println("Introduzca una cantidad entera de dinero para retirarla: ");
				c1.retirarDinero(menu);
				break;
			case 3:
				System.out.println("Su saldo en dólares Americanos($) es: "+c1.convertirDolares(saldo)+"$");
				break;
			case 4:
				System.out.printf("Su saldo en euros(€) es: %.2f € ",c1.consultarSaldo(saldo));
				break;
			default: 
				System.out.println("Opción incorrecta, intentelo de nuevo");
				}
		}while(menu!=0);
		
	}

}
