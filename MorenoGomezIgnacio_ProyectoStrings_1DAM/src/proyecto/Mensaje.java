package proyecto;

public class Mensaje {
	
	private String texto;

	public Mensaje(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensaje [texto=" + texto + "]";
	}
	
	public void mostrarMensajeActual() {
		System.out.println(texto);
	}
	
	public void convertirMayusculas() {
		
	}
	public void convertirMinusculas() {
		
	}
	
	public void convertirPrimeraLetraMayuscula() {
		
	}
	
	public void cambiarCadenaDeCaracteres() {
		
	}
	public void eliminarCadenaDeCaracteres() {
		
	}
	
}
