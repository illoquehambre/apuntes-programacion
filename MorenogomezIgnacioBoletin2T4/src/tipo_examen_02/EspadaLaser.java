package tipo_examen_02;

public class EspadaLaser extends Producto{
	
	private String tipo;
	private String color;
	
	
	public EspadaLaser(double precioBase, int nUnidades, String nombre, String tipo, String color) {
		super(precioBase, nUnidades, nombre);
		this.tipo = tipo;
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return super.toString()+"EspadaLaser [tipo=" + tipo + ", color=" + color + "]";
	}


	@Override
	public double calculaPVP(double porcGanan, double cantFij) {
		int divisor=100;
		String doble= "doble";
		// TODO Apéndice de método generado automáticamente
		this.cuidaito();
		if(tipo.equalsIgnoreCase(doble)) {
			return getPrecioBase()*porcGanan/divisor+cantFij;
		}else {
			return getPrecioBase()*porcGanan/divisor;
		}
		
		
	}
	
	public void cuidaito() {
		System.out.println("Cuidaito que hase pupa");
	}
	
}
