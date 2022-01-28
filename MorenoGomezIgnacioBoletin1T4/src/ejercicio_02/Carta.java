package ejercicio_02;

public class Carta extends Documento {
	
	private String fecha;

	public Carta(String encabezado, String fecha) {
		super(encabezado);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() +"\n" + fecha ;
	}
	
}
