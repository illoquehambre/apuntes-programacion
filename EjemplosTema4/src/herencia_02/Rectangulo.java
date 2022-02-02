package herencia_02;

public class Rectangulo extends Figura {
	
	private double altura, base;

	public Rectangulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
}
