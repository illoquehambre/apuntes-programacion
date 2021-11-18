package ejercicio_05;
import java.util.Random;

public class Aleatorios {
	
	//atributos
	
	//constructor
	
	//metodos
	public int randomRuleta(int maximo, int minimo) {
		maximo=37;
		minimo=1;
		Random num=new Random (System.nanoTime());
		return num.nextInt(maximo-minimo)+minimo;
	}
	
	public int randomPareNone(int maximo, int minimo) {
		maximo=2;
		minimo=1;
		Random num=new Random (System.nanoTime());
		return num.nextInt(maximo-minimo)+minimo;
	}
	public int randomPrimitiva(int maximo, int minimo) {
		maximo=49;
		minimo=1;
		Random num=new Random (System.nanoTime());
		return num.nextInt(maximo-minimo)+maximo;
	}
}
