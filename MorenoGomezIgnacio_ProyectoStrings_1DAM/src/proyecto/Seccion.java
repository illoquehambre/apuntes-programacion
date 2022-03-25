package proyecto;

public class Seccion {
	
	private String texto;
	private String nombre;

	public Seccion(String texto, String nombre) {
		super();
		this.texto = texto;
		this.setNombre(nombre);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Mensaje [texto=" + texto + "]";
	}
	
	public void mostrarMensajeActual() {
		System.out.println(texto);
	}
	
	
}
