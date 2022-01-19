package ejercicio_01;

public class Producto {
	
	//atributos
	private double precioDeFabrica;
	private double precioDeVenta;
	private double costeDeFabricacion;
	private int cantidad;
	
	
	public Producto(double precioDeFabrica, double precioDeVenta, double costeDeFabricacion, int cantidad) {
		super();
		this.precioDeFabrica = precioDeFabrica;
		this.precioDeVenta = precioDeVenta;
		this.costeDeFabricacion = costeDeFabricacion;
		this.cantidad = cantidad;
	}


	public double getPrecioDeFabrica() {
		return precioDeFabrica;
	}


	public void setPrecioDeFabrica(double precioDeFabrica) {
		this.precioDeFabrica = precioDeFabrica;
	}


	public double getPrecioDeVenta() {
		return precioDeVenta;
	}


	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}


	public double getCosteDeFabricacion() {
		return costeDeFabricacion;
	}


	public void setCosteDeFabricacion(double costeDeFabricacion) {
		this.costeDeFabricacion = costeDeFabricacion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
