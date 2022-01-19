package ejercicios;

public class Deposito {
	//atributos
	private double altura;
	private double radio;
	private double costeFabricacion;
	
	//constructor
	public Deposito(double altura, double radio, double costeFabricacion) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.costeFabricacion = costeFabricacion;
	}
	public Deposito(double altura, double radio) {
		super();
		this.altura = altura;
		this.radio = radio;
	}
	
	//getter&&setter
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getCosteFabricacion() {
		return costeFabricacion;
	}
	public void setCosteFabricacion(double costeFabricacion) {
		this.costeFabricacion = costeFabricacion;
	}
	
	
}
