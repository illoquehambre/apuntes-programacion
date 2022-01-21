package ejercicio_09;

public class Machine {
	//atributos
	private int contrasenia;
	private double recaudoDiario;
	
	//constructores
	public Machine(int contrasenia, double recaudoDiario) {
		super();
		this.contrasenia = contrasenia;
		this.recaudoDiario = recaudoDiario;
	}


	public int getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(int contrasenia) {
		this.contrasenia = contrasenia;
	}
	public double getRecaudoDiario() {
		return recaudoDiario;
	}
	public void setRecaudoDiario(double d) {
		this.recaudoDiario = d;
	}
	//m�todos
	public boolean comprobarContraseña(int numeroLeido, Machine maquina, Ticket ticket) {
		if(numeroLeido==contrasenia) {
			return true;
		}else {
			ticket.error();
			return false;
		}
	}
	public void comprarTicket(Ticket ticket, int nViajes) {
		setRecaudoDiario(getRecaudoDiario()+(nViajes*ticket.getPrecioUd()));
	}
	
	
	
}

