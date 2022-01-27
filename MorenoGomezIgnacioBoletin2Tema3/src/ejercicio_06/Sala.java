package ejercicio_06;

public class Sala {
	private int id;
	private int nLocalidades;
	private Entrada[][] asientos;
	private double dineroRecaudado;
	
	public Sala(int id) {
		super();
		this.id = id;
		this.nLocalidades = 0;
		this.asientos = new Entrada[10][5];
		this.dineroRecaudado = 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getnLocalidades() {
		return nLocalidades;
	}
	public void setnLocalidades(int nLocalidades) {
		this.nLocalidades = nLocalidades;
	}
	public Entrada[][] getAsientos() {
		return asientos;
	}
	public void setAsientos(Entrada[][] asientos) {
		this.asientos = asientos;
	}
	public double getDineroRecaudado() {
		return dineroRecaudado;
	}
	public void setDineroRecaudado(double dineroRecaudado) {
		this.dineroRecaudado = dineroRecaudado;
	}
	
	
	
	//metodos
	
	public void mostrarCartelera() {
		System.out.println("Peliculas Disponibles:");
		System.out.println("\nSala "+id+": La nueva de Matrix");
	}
	
	public void comprarEntrada(int butaca, int fila) {
		dineroRecaudado=dineroRecaudado+asientos[butaca][fila].getPrecio();
		asientos[butaca][fila].setdisponible(false);
	}

}
