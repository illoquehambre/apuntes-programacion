package ejercicio_05;
import java.util.Random;

public class Aleatorios {
	
	//atributos
	
	//constructor
	
	//metodos
	public int randomRuleta(int n) {
		Random num=new Random (System.nanoTime());
		return num.nextInt(37-1)+1;
	}
	
	public int randomPareNone(int n) {
		Random num=new Random (System.nanoTime());
		return num.nextInt(2-1)+1;
	}
	public int randomPrimitiva(int n) {
		Random num=new Random (System.nanoTime());
		return num.nextInt(49-1)+1;
	}
}
