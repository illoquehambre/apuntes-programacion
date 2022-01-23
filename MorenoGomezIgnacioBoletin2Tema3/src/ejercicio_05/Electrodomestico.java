package ejercicio_05;

public class Electrodomestico {
	//atributos
	private double precioBase;
	private String color;
	private char consumo;
	private double peso;
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	public Electrodomestico() {
		super();
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = 5;
	}
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//metodos
	
	public boolean comprobarColor() {
		String[] color= {"blanco"," negro", "rojo", "azul", "gris"};
		for(int i=0;i<color.length;i++) {
			if(this.color.equalsIgnoreCase(color[i])) {
				return true;
			}
			
		}
		this.color="Blanco";
		return false;
	}
	
	public boolean comprobarConsumoEnergetico(){
		char[] consumo= {'A', 'B', 'C', 'D', 'E', 'F'};
		for(int i=0;i<consumo.length;i++) {
			if(this.consumo==consumo[i]) {
				return true;
			}
		}
	
		this.consumo='F';
		return false;
	}
	
	public double calcularPrecioFinal() {
		char[] consumo= {'A', 'B', 'C', 'D', 'E', 'F'};
		double[] precioConsumo= {100,80,60,50,30,10};
		double precioFinal=0;
		for(int i=0;i<precioConsumo.length;i++) {
			if(this.consumo==consumo[i]) {
				precioFinal = precioBase+precioConsumo[i];
			}
		}
		return precioFinal;
	}
		
}
