package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0;
		String nombre, apellidos;
		double notaMedia, puntos;
		Alumno a1, a2, a3;//Se declara la variable donde se guardaran los datos del alumno 1 con los atributos de la clase Alumno
		a1=new Alumno(45, "Maria", "Garc�a Marshal", 8.24);//La variable queda instanciada. Estas dos lineas se pueden hacer en un a sola)
		//si no doy valores dentro del par�ntesis, eclipse le mete un valor por defecto(ints 0, strings null, double 0.0 ...)
		//para darle valores a la variable se utiliza un CONSTRUCTOR
		//Un constructor se crea en la clase que define al objeto
		System.out.println(a1.getEdad()+"\n" +a1.getNombre()+"\n"+ a1.getApellidos()+"\n"+ a1.getNotaMedia());
		//en vez de poner el nombre del atributo privado, ponemos el nombre del getter&setter que se vincula al atributo desde dentro
		
		
		System.out.println("Edad:");
		edad=Leer.datoInt();		
		System.out.println("Nombre:");
		nombre=Leer.dato();
		System.out.println("Apellidos: ");
		apellidos=Leer.dato();
		System.out.println("Nota media: ");
		notaMedia=Leer.datoDouble();
		
		a2=new Alumno(edad, nombre, apellidos, notaMedia);
		System.out.println(a2.getEdad()+"\n" +a2.getNombre()+"\n"+ a2.getApellidos()+"\n"+ a2.getNotaMedia());
		
		System.out.println("Edad:");
		edad=Leer.datoInt();		
		System.out.println("Nombre:");
		nombre=Leer.dato();
		System.out.println("Apellidos: ");
		apellidos=Leer.dato();
		System.out.println("Nota media: ");
		notaMedia=Leer.datoDouble();
		
		a2.setNotaMedia(notaMedia);
		a2.setEdad(edad);
		a2.setNombre(nombre);
		a2.setApellidos(apellidos);
		System.out.println(a2.getEdad()+"\n" +a2.getNombre()+"\n"+ a2.getApellidos()+"\n"+ a2.getNotaMedia());
		System.out.println("Cuantos puntos desea sumarle?");
		puntos=Leer.datoDouble();
		a2.añadirPuntos(puntos);//devuelve lo que he puesto en el m�todo a�adirPuntos
		System.out.println("Nueva nota media: "+a2.getNotaMedia());
		
		/*
		System.out.println("Edad:");
		edad=Leer.datoInt();		
		System.out.println("Nombre:");
		nombre=Leer.dato();
		System.out.println("Apellidos: ");
		apellidos=Leer.dato();
		System.out.println("Nota media: ");
		notaMedia=Leer.datoDouble();
		
		a3=new Alumno(edad, nombre, apellidos, notaMedia);*/
		
	}

}
