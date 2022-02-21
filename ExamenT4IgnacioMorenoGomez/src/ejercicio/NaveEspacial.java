package ejercicio;

public class NaveEspacial extends Avion {
	
	private int nMotores;

	public NaveEspacial(double longitud, int anioFabric, int id, double litrosCombust, int nMotores) {
		super(longitud, anioFabric, id, litrosCombust);
		this.nMotores = nMotores;
	}

	public int getnMotores() {
		return nMotores;
	}

	public void setnMotores(int nMotores) {
		this.nMotores = nMotores;
	}

	@Override
	public String toString() {
		return super.toString()+"[nMotores=" + nMotores + "]";
	}
	
	
	public double calcularPrecioAterrizaje
	(double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		int divisor=100;
		if(nMotores>limitMotores) {
			return super.calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores,precMisil)+
					(super.calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores,precMisil)*
					(porcMotores/divisor));
		}else {
			return super.calcularPrecioAterrizaje(precioTam, limite, precioExtra, porcMotores, limitMotores, precMisil);
		}
		
	}
	
	
	public void avisarExtraterrestres() {
		System.out.println("\tNave espacial, llamen a los Men in Black.");
	}
	
}
