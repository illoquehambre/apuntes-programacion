package herencia_02;

public class Rectangulo extends Figura {
	
	private double altura, base;

	public Rectangulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + ", toString()=" + super.toString() + "]";
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*base+2*altura;
	}
	
}
