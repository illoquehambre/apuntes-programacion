package ejercicio_07;

import lectura.Leer;

public class Cuenta_corriente {

	//atributos
	private double saldo=0;
	private String titular;
	
	//constructor
	public Cuenta_corriente(double saldo, String titular) {
		this.saldo=saldo;
		this.titular=titular;
	}
	//getter && setters
	//get
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	//set
	public void setSaldo(int saldo){
		this.saldo=saldo;
	}
	public void setTitular(String titular) {
		this.titular=titular;
	}
	//metodos
	
	public int ingresarDinero(int ingresar) {
		ingresar=Leer.datoInt();
		saldo=saldo+ingresar;
		System.out.println("Operación realizada");
		return ingresar;		
	}
	public int retirarDinero(int retirar) {
		retirar=Leer.datoInt();
		if(retirar>saldo) {
			System.out.println("No hay suficiente dinero en la cuenta");
			retirar=0;
			System.out.println("Operación cancelada");
		}else {
			saldo=saldo-retirar;
			System.out.println("Operación realizada");
		}
		return retirar;		
	}
	public double convertirDolares(double dolaresSaldo) {
		double cambio=1.1302;
		dolaresSaldo=saldo*cambio;
		return dolaresSaldo;
	}
	public double consultarSaldo(double saldo) {
		saldo=this.saldo;
		return saldo;
	}
	
}
