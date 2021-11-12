package ejercicio1;
import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=0, opcion=0, min=0, max=0, nClase=0, contador=0, mediaA�oAnt=90, PorCiento=100, porcentaje=0;
		double limite=0, media=0;
		Random r= new Random(System.nanoTime());
		
		int [] euros;
		
		System.out.println("Bienevenido al programa de gesti�n de dinero de la campa�a del DOMUND");
		System.out.println("Diga cuantas clases hay en el centro o pulse 0 para terminar el programa");
		tam=Leer.datoInt();
		if(tam!=0) {
			euros= new int[tam];
			do {
				System.out.println("Pulse\tPara realizar/mostar\n");
				System.out.println("0\t SALIR del programa");
				System.out.println("1\t Introducir los datos de cada clase");
				System.out.println("2\t Dinero recogido por una clase a su elecci�n");
				System.out.println("3\t N� de  clases que superan cierto l�mite de recaudaci�n");
				System.out.println("4\t Media recauda de todas las clases");
				System.out.println("5\tDinero recaudado por cada clase");
				System.out.println("6\tTanto por ciento de dinero recaudado en una clase,"
						+ " con respecto al a�o anterior");
				opcion=Leer.datoInt();
				switch(opcion) {
				case 0:
					System.out.println("Fin del programa");
					break;
				case 1:
					System.out.println("�Cu�l ha sido el valor m�s peque�o registrado?");
					min=Leer.datoInt();
					System.out.println("�Y el m�ximo?");
					max=Leer.datoInt();
					do{
						euros[nClase]=r.nextInt(max-min+1)+min;
						nClase++;
					}while(nClase<euros.length);
					break;
				case 2:
						System.out.println("Introduzca el n�mero de la clase cuyos datos desea observar");
						nClase=Leer.datoInt();
						if(nClase<=euros.length) {
							System.out.printf("Clase %d: %d�\n",nClase, euros[nClase-1]);		
						}else {
							System.out.println("La clase introducida no existe");
						}
						break;
				case 3:
					System.out.println("Introduzca una cantidad de dinero y "
							+ "se le mostarar� cuantas clases han superado el l�mite impuesto");
					limite=Leer.datoInt();
					for(int i=0;i<euros.length;i++) {
						if(limite>=euros[i]) {
							contador++;
						}
					}
					System.out.printf("El N� de clases que han superado el l�mite de"
							+ " %.2f� es de %d clases \n",limite, contador );
					break;
				
				case 4:
					for(int i=0;i<euros.length;i++) {
						media=media+euros[i];
					}
					media=media/euros.length;
					System.out.printf("La media recaudada es de %.2f� por clase\n", media);
					break;
				case 5:
					System.out.println("\tClase\t\tCantidad(�)\n");
					for(int i=0;i<euros.length;i++){
						System.out.printf("\tClase %d\t\t%d�\n",i+1,euros[i]);
					}
					break;
				case 6:
					System.out.println("Introduzca el n�mero de la clase cuyos datos desea observar");
					nClase=Leer.datoInt();
					porcentaje=euros[nClase]/mediaA�oAnt*PorCiento;
					System.out.printf("El porcentaje de dinero recaudado con respecto al a�o pasado en la "
							+ "clase %d es de %d %%\n\n",nClase, porcentaje  );
				}
			}while(opcion!=0);
			
			System.out.println("Gracias por usar este programa.");
		}
		
		

	}

}
