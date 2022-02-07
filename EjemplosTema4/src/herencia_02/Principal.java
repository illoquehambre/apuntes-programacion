package herencia_02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=2, y=3;
		//Figura f1=new Figura(x,y);//no se puede crear porque es abstracta
		Rectangulo c1=new Rectangulo(34,67,x, y);		
		Circulo c2=new Circulo(y, y);
		
		
		Figura rectangulo=new Rectangulo(0, 0, 0, 0);
		
		System.out.println(rectangulo.calcularArea());
		 	
	}

}
