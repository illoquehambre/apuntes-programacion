package ejemplo_herencia_01;

public class Consultor extends Trabajador {
	
	private int horas;
	private double tarifa;//preio/horaç
	
	public Consultor(String nombre, String apellidos, String puesto, int horas, double tarifa) {
		super(nombre, apellidos, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return super.toString()/*Este super.toString llama al toString del elemento padre*/+"Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	//metodos
	public double calcularPaga() {
		return super.calcularPaga()+ horas*tarifa;
	}
	
	public void avisarHorasExtra(int tope) {
		if(horas<tope) {
			System.out.println("Sigue trabajando esclavo");
		}else {
			System.out.println("Ya te puedes ir a casa campeón");
		}
	}
	
	
	
}
