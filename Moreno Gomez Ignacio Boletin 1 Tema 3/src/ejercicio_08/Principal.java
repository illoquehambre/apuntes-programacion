package ejercicio_08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boletoElegido=0;
		Sorteo boleto1=new Sorteo(boletoElegido);
		System.out.println("Bienvenido a la lotería");
		do {
			System.out.println("Introduzca un número entero menor de 4 dígitos por favor");	
			boleto1.comprarDecimo(boletoElegido);
		}while(boleto1.getBoletoElegido()>999 || boleto1.getBoletoElegido()<=0);
		if(boleto1.comprobarGanador()==true){
			System.out.println("Oleeeeeeeeee!!!");
			System.out.println("Su boleto "+boleto1.getBoletoElegido()+" es el boleto ganador");
		}else {
	
			System.out.println("Parece que la diosa de la fortuna no le acompaña hoy...");
			System.out.println("Pruebe de nuevo otro día");
		}
		
		
		
	}

}
