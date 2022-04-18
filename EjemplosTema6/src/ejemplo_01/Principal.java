package ejemplo_01;

import java.util.Scanner;

public class Principal {

	public static int dividir(int numerator, int denominator) throws ArithmeticException{
		return numerator/denominator;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);//Indica que va arecoger los datos del teclado
		boolean continuar=true;
		
		int num, den, result;
		String aux;
		do {
			System.out.println("\nMete un integer");
			aux=scan.nextLine();
			num=Integer.parseInt(aux);
			System.out.println("Mete un integer");
			aux=scan.nextLine();
			den=Integer.parseInt(aux);
			
			result= dividir(num, den);
			System.out.printf("\nResult: %d/%d=%d", num, den, result);
		}while(continuar);
		
	}

}
