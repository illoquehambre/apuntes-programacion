package ejercicio_09;

public class Ticket {
	//atributos
	private double precioUd=0;
	
	//constructor
	public Ticket(double precioUd){
		this.precioUd=precioUd;
	}
	
	//getters && setters
	public double getPrecioUd() {
		return precioUd;
	}

	public void setPrecioUd(double precioUd) {
		this.precioUd = precioUd;
	}
	
	//métodos
	public void imprimirTicket() {
		System.out.println("\t\tTICKET");
		System.out.println("Valido para");
	}
	
}
