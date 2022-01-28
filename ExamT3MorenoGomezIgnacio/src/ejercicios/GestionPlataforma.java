package ejercicios;

import java.util.Random;

public class GestionPlataforma {
	//atributos
	private int id;
	private double deposito;
	private int[] litrosPorDia;
	
	//constructor
	public GestionPlataforma(int id, double deposito, int[] litrosPorDia) {
		super();
		this.id = id;
		this.deposito = deposito;
		this.litrosPorDia = litrosPorDia;
	}
	
	public GestionPlataforma() {
		
	}
	
	//getter&&setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public int[] getLitrosPorDia() {
		return litrosPorDia;
	}

	public void setLitrosPorDia(int[] litrosPorDia) {
		this.litrosPorDia = litrosPorDia;
	}
	
	//metodos
	
	public double calcularVolumen(Deposito deposito) {
		double volumen=0;
		volumen = Math.PI*deposito.getRadio()*deposito.getRadio()*deposito.getAltura();
		return volumen;
	}
	
	public int[] litrosPorDiaDeLaSemana(double volumen, int desde, int hasta) {
		//double desde=0, hasta=volumen/7;
		Random random=new Random(System.nanoTime());
		litrosPorDia=new int[7];
		for(int i=0;i<litrosPorDia.length;i++) {
			litrosPorDia[i]=random.nextInt(hasta-desde+1)-desde;
			
		}
		return litrosPorDia;
	}
	
	public double calcularPrecioVenta(Deposito deposito, double porcentaje) {
		double precioVenta=0;
		int porCiento=100;
		precioVenta = deposito.getCosteFabricacion()*(porcentaje/porCiento)+deposito.getCosteFabricacion();
		return precioVenta;
	}
	
	public int mediaLitrosPorDia(int[] litrosPorDia) {
		int media=0, suma=0;
		for(int i=0;i<litrosPorDia.length;i++) {
			media=suma+litrosPorDia[i];
		}
		media=media/litrosPorDia.length;
		return media;
	}
	
}
