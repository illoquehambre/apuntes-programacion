package herencia_02;

public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio   ;
	}

	
	
}
