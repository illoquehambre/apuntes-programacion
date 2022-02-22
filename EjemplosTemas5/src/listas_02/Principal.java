package listas_02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <Alumno> listaAlumnos=new ArrayList <Alumno>();
		Alumno a=new Alumno("nacho", "moreno", "5412841R");
		listaAlumnos.add(a);
		
		System.out.println(listaAlumnos.size());
		
		System.out.println(listaAlumnos.get(0));
	}

}
