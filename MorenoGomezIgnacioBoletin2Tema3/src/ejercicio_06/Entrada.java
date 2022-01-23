package ejercicio_06;

public class Entrada {
	//atributos
	private static double precio;
	private int id;
	private boolean disponible;
	private int fila;
	private int butaca;
	
	public Entrada(int id, int fila, int butaca) {
		super();
		Entrada.precio = 5.95;
		this.id = id;
		this.disponible = true;
		this.fila = fila;
		this.butaca = butaca;
	}
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		Entrada.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isdisponible() {
		return disponible;
	}
	public void setdisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getButaca() {
		return butaca;
	}
	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

}
