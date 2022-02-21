package ejercicio;

public class Avion implements IAterrizaje{
	
	private double longitud;
	private int anioFabric;
	private int id;
	private double litrosCombust;
	
	
	public Avion(double longitud, int anioFabric, int id, double litrosCombust) {
		super();
		this.longitud = longitud;
		this.anioFabric = anioFabric;
		this.id = id;
		this.litrosCombust = litrosCombust;
	}
	
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public int getAnioFabric() {
		return anioFabric;
	}
	public void setAnioFabric(int anioFabric) {
		this.anioFabric = anioFabric;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLitrosCombust() {
		return litrosCombust;
	}
	public void setLitrosCombust(double litrosCombust) {
		this.litrosCombust = litrosCombust;
	}


	@Override
	public String toString() {
		return "[longitud=" + longitud + ", anioFabric=" + anioFabric + ", id=" + id + ", litrosCombust="
				+ litrosCombust + "]";
	}


	@Override
	public double calcularPrecioAterrizaje
	(double precioTam, double limite, double precioExtra, double porcMotores,int limitMotores, double precMisil) {
		// TODO Auto-generated method stub
		if(litrosCombust>limite) {
			return precioTam*longitud+precioExtra;
		}else {
			return precioTam*longitud;
		}
	
	}
	
	
	
	
	
}
