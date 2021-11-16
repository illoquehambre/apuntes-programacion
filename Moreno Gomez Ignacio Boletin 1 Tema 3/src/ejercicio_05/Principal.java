package ejercicio_05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aleatorios r1=new Aleatorios();
		int menu=0;
		do {
			System.out.println("\nBienvenido a los juegos de azar\n");
			System.out.println("\t Pulse\t\tPara\n");
			System.out.println("\t 0\t\tSALIR");
			System.out.println("\t 1\t\tRuleta de la Suerte");
			System.out.println("\t 2\t\tPares y Nones");
			System.out.println("\t 3\t\tPrimitiva");
			
			menu=Leer.datoInt();
			switch(menu) {
			case 0:
				System.out.println("Saliendo del programa");
				break;
			case 1:
				System.out.println("Bienvenido a la ruleta");
				System.out.println("Ha slido el número: "+r1.randomRuleta(0));
				break;
			case 2:
				System.out.println("Bienvenido a pares y nones");
				if(r1.randomPareNone(0)%2==0) {
					System.out.println("Ha salido pares ");
				}else {
					System.out.println("Ha salido none");
				}
				break;				
			case 3:
				System.out.println("bienvenido al sorteo de la primitiva");
				System.out.println("Ha slido el número: "+r1.randomPrimitiva(0));
				break;
			}
		}while(menu!=0);
		
	}

}
