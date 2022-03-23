package ejercicio_02_examen;

public class Movil extends Producto{
	
	private String marca;

	public Movil(String nombre, double precioBase, String marca) {
		super(nombre, precioBase);
		this.setMarca(marca);
		// TODO Apéndice de constructor generado automáticamente
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString()+ "Movil [marca=" + marca + "]";
	}

	
	
	
	
	

	
	
	
	
	
}
