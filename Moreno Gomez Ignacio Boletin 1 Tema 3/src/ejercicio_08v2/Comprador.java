package ejercicio_08v2;

public class Comprador {
	
	private double cuenta;
	private String nombre;
	private int[] boletoComprado;
	
	Utilidades u=new Utilidades();
	
	public Comprador(double cuenta, String nombre, int[] boletoComprado) {
		super();
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.boletoComprado = boletoComprado;
	}
	public int[] getBoletoComprado() {
		return boletoComprado;
	}
	public void setBoletoComprado(int[] boletoComprado) {
		this.boletoComprado = boletoComprado;
	}
	public double getCuenta() {
		return cuenta;
	}
	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean comprobarDinero(Billete billete) {
		if(getCuenta() - billete.getPrecio()>=0) {
			return true;
		}else {
			
			return false;
		}
	}
	public void comprarBillete(int[] boleto, Billete billete) {
		boletoComprado=boleto;
		if(comprobarDinero(billete)) {
			setCuenta(getCuenta() - billete.getPrecio());
			u.operacionRealizada();
		}else {
			u.dineroInsuficiente();
		}
		
	
	}
	
}
