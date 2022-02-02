package ejercicio_03;

import java.util.Arrays;

public class Gestion {
	
	private VehiculoMotor[] lista;

	public Gestion(VehiculoMotor[] lista) {
		super();
		this.lista = lista;
	}

	public VehiculoMotor[] getLista() {
		return lista;
	}

	public void setLista(VehiculoMotor[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void crearVehiculo(int tipo, int contador, double potencia, int cilindrada, String combustible) {
		switch(tipo) {
		case 1:
			lista[contador]=new Moto(potencia, cilindrada, combustible, tipo);
			break;
		case 2:
			lista[contador]=new Furgo(potencia, cilindrada, combustible, tipo);
			break;
			
		case 3:
			lista[contador]=new Coche(potencia, cilindrada, combustible, tipo);
			break;

		}
		
	}
	
	
}
