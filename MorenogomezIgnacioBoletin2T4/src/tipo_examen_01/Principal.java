package tipo_examen_01;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int contador=0;
		Habitacion[] lista=new Habitacion[3];
		Gestion ges=new Gestion(lista);
		
		ges.getLista()[0]=new Habitacion(200, "Luis", true, 4, 2);
		contador++;
		ges.getLista()[1]=new Apartamento(200, "Miguel", true, 3, 4, true);
		contador++;
		ges.getLista()[2]=new Suite(200, null, false, 3, 4, 45, 0);
		contador++;
		
		System.out.println(ges.calcularTodo(contador, 50, 20));
		
	}

}
