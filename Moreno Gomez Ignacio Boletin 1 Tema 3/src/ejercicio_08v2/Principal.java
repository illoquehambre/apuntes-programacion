package ejercicio_08v2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numerosDeUnBoleto=9, auxiliar=0;
		int[] boleto=new int[numerosDeUnBoleto];
		double cuenta=1000, precioBillete=20;
		String nombre;
		
		Comprador user;
		Billete billete=new Billete(precioBillete);
		
		System.out.println("Introduzca su nombre");
		
		nombre=Leer.dato();
		user= new Comprador(cuenta, nombre, boleto);
		user.setCuenta(cuenta);
		
		System.out.println("Bienvenido "+nombre+"\n\n");
		
		System.out.println("Introduzca 1 por uno los números de su boleto de lotería");
		System.out.println("Recuerde que solo puede introducir números entre 0 y 9");
		
		for(int i=0;i<boleto.length;i++) {
			System.out.print(i+1+"º número:");
			auxiliar=Leer.datoInt();
			if(auxiliar>=0 && auxiliar<=9) {
				boleto[i]=auxiliar;
				user.comprarBillete(boleto, billete);
			}else {
				System.out.println("Error, por favor introduzca números entre 0 y 9");
				i=boleto.length;
			}

		}
		

	}

}
