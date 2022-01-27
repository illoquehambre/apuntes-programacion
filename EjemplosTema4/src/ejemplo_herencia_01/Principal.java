package ejemplo_herencia_01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tope=8;
		
		Trabajador tr1=new Trabajador("Jose", "Martin", "Jefe Departamento");
		Empleado emp1=new Empleado("Pepe", "Rodriguz", "Esbirro", 0.50, 21.0);
		Consultor cons=new Consultor("Antonia", "Bollo", "Esbirro del esbirro", 42, 55.5);
		
		
		System.out.println(tr1.calcularPaga());
		System.out.println(emp1.calcularPaga());
		System.out.println(cons.calcularPaga());
		
		cons.avisarHorasExtra(tope);
	}

}
