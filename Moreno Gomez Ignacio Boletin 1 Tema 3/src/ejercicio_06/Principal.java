package ejercicio_06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaraCruz j1;
		int player=0;
//opción elegida por el jugador true=cara, false=cruz
		
		do {
			System.out.println("\n\nIntroduzca 1 para cara o 2 para cruz");
			player=Leer.datoInt();
			switch (player){
			case 0:
				break;
			case 1:
				j1= new CaraCruz(player);
				System.out.println("Ha elegido cara");
				j1.mostrarGanador();
				break;
			case 2:
				j1= new CaraCruz(player);
				System.out.println("Ha elegido cruz");
				j1.mostrarGanador();
				break;
			default:
				System.out.println("ERROR. Intentelo de nuevo.");
				break;		
			}
		}while(player!=0);
		
	}

}
