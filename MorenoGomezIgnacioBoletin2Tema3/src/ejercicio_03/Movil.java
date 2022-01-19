package ejercicio_03;

public class Movil {
	//atributos
	private String marca;
	private String modelo;
	private boolean vendido;
	private double precio;
	
	//Constructor
	public Movil(String marca, String modelo, boolean vendido, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.precio = precio;
	}
	//getter && setter
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
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}	
