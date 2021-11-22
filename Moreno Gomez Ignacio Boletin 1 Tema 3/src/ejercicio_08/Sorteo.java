package ejercicio_08;
import java.util.Random;
import lectura.Leer;

public class Sorteo {

	//atributos
	private int boletoElegido=0;
	
	//constructor
	
	public Sorteo(int boletoElegido) {
		this.boletoElegido=boletoElegido;
	}
	
	//getters
	public int getBoletoElegido() {
		return boletoElegido;
	}

	//setters
	public void setBoletoElegido(int boletoElegido) {
		this.boletoElegido=boletoElegido;
	}
	
	//métodos
	public void comprarDecimo(int boleto) {
		boleto=Leer.datoInt();
		this.boletoElegido=boleto;
	}
	public int generarGanador() {
		int boletoGanador;
		int max=999, min=1;
		Random n=new Random(System.nanoTime());
		boletoGanador= n.nextInt(max-min+1)+min;
		return boletoGanador;
	}
	public boolean comprobarGanador() {
		if(generarGanador()==boletoElegido) {
			return true;
		}else {
			return false;
		}
	}
}
