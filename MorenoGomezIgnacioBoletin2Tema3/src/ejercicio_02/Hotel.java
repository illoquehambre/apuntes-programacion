package ejercicio_02;

import java.util.Random;

public class Hotel {
	
	private Habitacion[] listaHabitacion;
	
	public Hotel(Habitacion[] listaHabitacion) {
		super();
		this.listaHabitacion = listaHabitacion;
	}
	public String mostrarTiposHabitacion(Habitacion habit) {
		String mensaje="ERROR";
		switch(habit.getTipo()) {
		case 0:
			mensaje="ERROR. No se ha elejido ninguna habitaciónERROR. No se ha elejido ninguna habitación";
			break;
		case 1:
			mensaje="Habitación simple";
			break;
		case 2:
			mensaje="Habitación doble";
			break;
		case 3:
			mensaje="Habitación de matrimonio";
			break;
		case 4: 
			mensaje="Suit de lujo";
			break;
		case 5:
			mensaje="Suit presidencial";
			break;
		}
		return mensaje;
	}
	public int calcularServiciosExtra(Habitacion habit, int max, int min) {
		Random random= new Random();
		int costeServicios=0;
		costeServicios=random.nextInt((max-min+1)+min);
		habit.setServiciosExtra(costeServicios);
		return costeServicios;
	}
	public boolean comprobarOcupacion(Habitacion habit){
		if(habit.getnDiasOcupada()==0) {
			return true;
		}else {
			return false;
		}
	}
	public double calcularPrecioFinal(Habitacion habit){
		double precioFinal=0;
		precioFinal=(habit.getPrecioPorNoche()[habit.getTipo()]*habit.getnDiasOcupada()+habit.getServiciosExtra());
		return precioFinal;
	}
	public void mostrarFactura(Habitacion habit, int max, int min) {
		System.out.println("\t\tHotel Maquelele\n");
		System.out.println("\t****************************");
		System.out.println("\tCliente:\t\t"+habit.getNombreCliente());
		System.out.println("\tTipo habitacion:\t"+this.mostrarTiposHabitacion(habit));
		System.out.println("\tPrecio por noche:\t"+habit.getPrecioPorNoche()[habit.getTipo()]);
		System.out.println("\tNoches de estancia:\t"+habit.getnDiasOcupada());
		System.out.println("\tServicios Extra: \t"+this.calcularServiciosExtra(habit, max, min));
		System.out.println("\t****************************");
		System.out.println("\tPrecio Final:\t"+this.calcularPrecioFinal(habit));
		System.out.println("\t****************************");
	}
}
