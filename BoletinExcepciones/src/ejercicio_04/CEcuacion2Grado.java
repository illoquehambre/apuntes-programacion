package ejercicio_04;

public class CEcuacion2Grado {
	
	private double a;
	private double b;
	private double c;
	public CEcuacion2Grado(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "CEcuacion2Grado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	//metodos
	
	  public void comprobarAB() throws EcuacionDegenerada{//aqui usamos THROWS con 's'
		  if(a==0 && b==0) {
			  throw new EcuacionDegenerada("La ecuacion es degenerada"); //aqui usamos THROW sin 'S'	
		  }
	  }
	
	public double calcularDiscriminante() throws RaizCompleja{
		double discriminate= Math.pow(b,  2)-(4*a*c);
		if(discriminate<0) {
			throw new RaizCompleja("Las raices son complejas");
		}
		return discriminate;
		
	}
	
	public double[] calcularEc() throws RaizCompleja {
		double []soluciones;
		if(calcularDiscriminante()==0) {
			soluciones = new double[1];
			soluciones[0]=((-b)-(4*a*c)/(2*a));
		}else {
			soluciones=new double[2];
			soluciones[0]=((-b)+Math.sqrt(calcularDiscriminante()))/(2*a);
			soluciones[1]=((-b)+Math.sqrt(calcularDiscriminante()))/(2*a);
		}
		return soluciones;
	}
}
	
	

