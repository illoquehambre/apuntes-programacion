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
	
	//metodos
	public void imprimirTicket(int n) {
		System.out.println("*****************");
		System.out.println("\t\tTICKET");
		System.out.println("*****************");
		System.out.println("Valido para "+n+" viajes");
		System.out.println("*****************");
	}
	public void error() {
		System.out.println("Error. Inténtelo de nuevo.");
	}
}
