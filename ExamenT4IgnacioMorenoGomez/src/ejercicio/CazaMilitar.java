package ejercicio;

public class CazaMilitar extends Avion{
	
	private double potencia;
	private int nMisiles;
	
	
	public CazaMilitar(double longitud, int anioFabric, int id, double litrosCombust, double potencia,
			int nMisiles) {
		super(longitud, anioFabric, id, litrosCombust);
		this.potencia = potencia;
		this.nMisiles = nMisiles;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public int getnMisiles() {
		return nMisiles;
	}


	public void setnMisiles(int nMisiles) {
		this.nMisiles = nMisiles;
	}


	@Override
	public String toString() {
		return super.toString()+" [potencia=" + potencia + ", nMisiles=" + nMisiles + "]";
	}
	
	@Override
	public double calcularPrecioAterrizaje
	(double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		// TODO Auto-generated method stub
		return super.calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores,limitMotores, precMisil)+nMisiles*precMisil;
	
	}
	
}
