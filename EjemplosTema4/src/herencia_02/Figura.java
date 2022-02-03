package herencia_02;

public abstract class Figura {
	
	private double x;
	private double y;
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}


	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	public void metodoSoloDeFigura() {
		System.out.println("Este método solo estará en Figura");
	}

}

