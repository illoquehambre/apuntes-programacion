package proyecto;

public class Seccion {
	
	private String texto;
	private int id;

	public Seccion(String texto, int id) {
		super();
		this.texto = texto;
		this.id=id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Seccion [id=" + id +", texto=" + texto+"]";
	}

	public void mostrarMensajeActual() {
		System.out.println(texto);
	}
	
	
}
