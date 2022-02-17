package tipo_examen_02;

public class Movil extends Producto{
	
	private String marca;
	private String modelo;
	
	
	public Movil(double precioBase, int nUnidades, String nombre, String marca, String modelo) {
		super(precioBase, nUnidades, nombre);
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return super.toString()+"Movil [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public double calculaPVP(double porcGanan, double cantFij) {
		int divisor=100;
		return getPrecioBase()*porcGanan/divisor;
	}
}
