package ejercicio_02;

public class Socio {
	private String nombre;
	private String apellidos;
	private int antiguedadSocio;
	private boolean vip;
	private double cuenta;
	
	public Socio(String nombre, String apellidos, int antiguedadSocio, boolean vip, double cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.antiguedadSocio = antiguedadSocio;
		this.vip = vip;
		this.cuenta=cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAntiguedadSocio() {
		return antiguedadSocio;
	}
	public void setAntiguedadSocio(int antiguedadSocio) {
		this.antiguedadSocio = antiguedadSocio;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
	public double getCuenta() {
		return cuenta;
	}
	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", antiguedadSocio=" + antiguedadSocio
				+ ", vip=" + vip + ", cuenta=" + cuenta + "]";
	}
	
	/*
	public boolean comprobarDinero(int nMeses, double precioMes) {
		boolean prueba;
		if(cuenta<cuenta-(nMeses*precioMes)) {
			prueba= false;
		}else {
			prueba= true;
		}
		return prueba;
		
	}
	public void pagarCuotas(int nMeses, double precioMes) {
		
		cuenta=cuenta-(nMeses*precioMes);
	}
	
	
	
	public void reservarPistas(String fecha, gestionClub gest) {
		
		gest.getFechasPistasReservadas().add(fecha);
	}
	
	*/
	
	
}
