package ejercicio_06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaraCruz j1;
		int auxiliar=0;
		boolean player, result=true;
//opción elegida por el jugador true=cara, false=cruz
		
		do {
			System.out.println("Introduzca 1 para cara o 2 para cruz");
			auxiliar=Leer.datoInt();
			switch (auxiliar){
			case 0:
				break;
			case 1:
				player=true;
				j1= new CaraCruz(player, result);
				j1.setResult(j1.lanzarMoneda());
				System.out.println("Ha elegido cara");
				System.out.println(j1.mostrarGanador());
				break;
			case 2:
				player=false;
				j1= new CaraCruz(player, result);
				j1.setResult(j1.lanzarMoneda());
				System.out.println("Ha elegido cruz");
				System.out.println(j1.mostrarGanador());
				break;
			default:
				System.out.println("mete 1 o 2 coño");
				break;		
			}
		}while(auxiliar!=0);
		
	}

}
