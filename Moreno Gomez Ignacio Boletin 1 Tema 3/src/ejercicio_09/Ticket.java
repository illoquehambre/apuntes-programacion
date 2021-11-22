package ejercicio_09;

public class Ticket {
	//atributos
	private double precioUd=0;
	private double total=0;
	
	//constructor
	public Ticket(double precioUd, double total){
		this.precioUd=precioUd;
		this.total=total;
	}
	//getters
	public double getPrecioUd() {
		return precioUd;
	}
	public double getTotal() {
		return total;
	}
	//setters
	
}
