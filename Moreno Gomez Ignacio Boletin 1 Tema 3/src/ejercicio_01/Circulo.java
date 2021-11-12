package ejercicio_01;

public class Circulo {
	//Atributos
	private double radio;
	
	//Constructor
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	public Circulo () {
		
	}
	//_
	//Getter and setters
	
	//getter
	public double getRadio() {
		return radio;
	}
	//setter
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	//métodos
	public double calcularArea () {//la variable debe tener un verbo en infinitvo
		//NUNCA SE PUEDEN DEVOLVER DOS DATOS EN UN MISMO MÉTODO 	
		return Math.PI*Math.pow(radio, 2);//LOS    
	}
}
