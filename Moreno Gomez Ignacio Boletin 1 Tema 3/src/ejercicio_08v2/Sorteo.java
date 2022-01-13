package ejercicio_08v2;
import java.util.Random;
public class Sorteo {

		//atributos
	private int[] boletoGanador;
	private int[] premio;
	

	//constructores
	public Sorteo(int[] boletoGanador, int[] premio) {
		super();
		this.boletoGanador = boletoGanador;
		this.premio = premio;
	}
	public Sorteo() {
		
	}

	//getter && setters
	public int[] getBoletoGanador() {
		return boletoGanador;
	}



	public void setBoletoGanador(int[] boletoGanador) {
		this.boletoGanador = boletoGanador;
	}



	public int[] getPremio() {
		return premio;
	}



	public void setPremio(int[] premio) {
		this.premio = premio;
	}


	//métodos
	public void generarBoletoGanador(Sorteo sort) {
		int max=9, min=0;
		Random aleatorio=new Random(System.nanoTime());
		for(int i=0;i<sort.getBoletoGanador().length;i++) {
			getBoletoGanador()[i]=aleatorio.nextInt((max-min)+min)+1;
		}
		
	}
	public void generarPremios(Sorteo sort) {
		int premioMin=20, multiplicador=5;
		for(int i=0;i<sort.getBoletoGanador().length;i++) {
			getPremio()[i]=premioMin;
			premioMin=premioMin*multiplicador;
		}
	}
	
}
