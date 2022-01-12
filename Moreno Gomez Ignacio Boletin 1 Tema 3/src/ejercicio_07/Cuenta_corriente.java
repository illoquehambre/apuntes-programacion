package ejercicio_07;

import lectura.Leer;

public class Cuenta_corriente {

	//atributos
	private double saldo;
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
		ingresar=Leer.datoInt();//No se lee en los m�todos
		saldo=saldo+ingresar;
		System.out.println("Operaci�n realizada");//no se ponen sysos en los m�todos
		return ingresar;		
	}
	public int retirarDinero(int retirar) {
		retirar=Leer.datoInt();//No se lee en los m�todos
		if(retirar>saldo) {
			System.out.println("No hay suficiente dinero en la cuenta");//no se ponen sysos en los m�todos
			retirar=0;
			System.out.println("Operaci�n cancelada");//no se ponen sysos en los m�todos//no se ponen sysos en los m�todos
		}else {
			saldo=saldo-retirar;
			System.out.println("Operaci�n realizada");//no se ponen sysos en los m�todos
		}
		return retirar;		
	}
	public double convertirDolares(double dolaresSaldo) {
		double cambio=1.1326;
		dolaresSaldo=saldo*cambio;
		return dolaresSaldo;
	}
	public double consultarSaldo(double saldo) {
		saldo=this.saldo;
		return saldo;
	}
	
}
