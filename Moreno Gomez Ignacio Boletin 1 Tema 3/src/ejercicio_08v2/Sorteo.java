package ejercicio_08v2;

public class Sorteo {

		//atributos
	private int[] boletoGanador;
	private int premio;
	
	public Sorteo(int[] boletoGanador, int premio) {
		super();
		this.boletoGanador = boletoGanador;
		this.premio = premio;
	}

	public int[] getBoletoGanador() {
		return boletoGanador;
	}

	public void setBoletoGanador(int[] boletoGanador) {
		this.boletoGanador = boletoGanador;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}
	
	
	
}
