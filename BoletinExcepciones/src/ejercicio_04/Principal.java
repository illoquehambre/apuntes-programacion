package ejercicio_04;

import java.util.Scanner;

public class Principal {
	
	/*4) Escribe una clase denominada CEcuacion2Grado. Introduce los coeficientes de la ecuación: a, b y
	c. Diseña un bloque try que trate las siguientes excepciones definidas por el programador:
	a) Si a y b son iguales a 0 aparece un mensaje indicando que la ecuación es degenerada.
	b) Si el discriminante es menor que 0 aparece un mensaje indicando que las raíces son
	complejas.
	Recuerda que el discriminante es b al cuadrado menos 4*a*c. Si a == 0 y b!= 0 la ecuación tiene una
	única raíz igual a – c/b Utiliza los métodos sqrt y abs (valor absoluto) de la clase final Math.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		boolean seguir=true;
		String aux;
		Scanner scan=new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduce el valor de a");
				aux=scan.nextLine();
				a=Integer.parseInt(aux);
				System.out.println("Introduce el valor de b");
				aux=scan.nextLine();
				b=Integer.parseInt(aux);
				System.out.println("Introduce el valor de c");
				aux=scan.nextLine();
				c=Integer.parseInt(aux);
				CEcuacion2Grado ec=new CEcuacion2Grado(a,b,c);
				
				ec.comprobarAB();
				ec.calcularDiscriminante();
				
				for(double sol : ec.calcularEc()) {
					System.out.printf("solucion: %.2f.\n", sol);
				}
			}catch(NumberFormatException num){
				System.out.println("\n Introduzca un número entero");
			}catch(EcuacionDegenerada ed) {
				System.out.println(ed.getMessage());
			}catch(RaizCompleja rc) {
				System.out.println(rc.getMessage());
			}
		}while(seguir);
		
		
		
	}

}
