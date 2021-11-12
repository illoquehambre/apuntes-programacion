package ejercicio_03;

public class Cilindro {
	//atributos
	private double altura;
	private double radio;
	
	//constructor
	public Cilindro (double radio, double altura) {
		this.altura=altura;
		this.radio=radio;
		
	}
	//getter and setters
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	//métodos
	public double calcularVolumen() {
		return Math.PI*Math.pow(radio, 2)*altura;
	}
}

