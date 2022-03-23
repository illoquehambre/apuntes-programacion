package ejercicio_02_examen;

public class EspadasLaser extends Producto{
	
	private String color;
	
	public EspadasLaser(String nombre, double precioBase, String color) {
		super(nombre, precioBase);
		this.setColor(color);
		// TODO Apéndice de constructor generado automáticamente
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+ "EspadasLaser [color=" + color + "]";
	}
	
	
	

	







	
	
}
