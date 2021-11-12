package ejemplo1;

public class Alumno {
	
	//Atributos
	private int edad;//esto no es una variable int, es el atributo edad de un alumno, una caracteristica del objeto una vez creado
	private String nombre, apellidos;
	private double notaMedia;//no se les da ningun valor al declararlas
	
	//Constructor
	public Alumno (int edad, String nombre, String apellidos, double notaMedia) {
		//Esto es el constructor de un alumno
		this.edad=edad;//this.nombreAtributo = nombreVariable (en este caso se llaman igual, pero no tendría por que ser así
		this.apellidos=apellidos;
		this.nombre=nombre;
		this.notaMedia=notaMedia;
		
		
	}
	//getters and setters
	//siempre se deben hacer debajo de los constructores
	
	//getter
	//1. acceso:public
	//2.tipo de lo que devuelve (int, double, String...)
	//3. método (getEdad)
	public int getEdad () {//no hay que darle nada en los paréntesis para que de un valor, solo da no requiere datos introducido
		return edad;//devuelve la edad
		
	}
	//setter
	//el constructor crea el objeto mientras que el setter sirve para modificarlo
	//no devuelven nada, es por esto que ponemos "void"
	//void indica que no devuelve ningún dato de ningun tipo
	public void setEdad (int edad) {//se le debe dar un valor en los paréntesis para oder introducir un valor
		this.edad=edad;//lo mismo que se ponia en los constructores
	}
	public String getNombre () {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos () {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public double getNotaMedia () {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia=notaMedia;
	}
	
	//primer método
	public double añadirPuntos(double puntos) {//se está declarando la variable puntos
		
		notaMedia=notaMedia+puntos;
		return notaMedia;
	}
	


}
