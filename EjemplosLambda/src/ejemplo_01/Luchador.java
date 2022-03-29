package ejemplo_01;

public class Luchador implements Comparable <Luchador>{
	
	private String nombre;
	private double ptVel;
	private double ptHP;
	private double ptAtaq;
	private double ptDef;
	private double damage;
	
	
	public Luchador(String nombre, double ptVel, double ptHP, double ptAtaq, double ptDef, double damage) {
		super();
		this.nombre = nombre;
		this.ptVel = ptVel;
		this.ptHP = ptHP;
		this.ptAtaq = ptAtaq;
		this.ptDef = ptDef;
		this.damage = damage;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPtVel() {
		return ptVel;
	}


	public void setPtVel(double ptVel) {
		this.ptVel = ptVel;
	}


	public double getPtHP() {
		return ptHP;
	}


	public void setPtHP(double ptHP) {
		this.ptHP = ptHP;
	}


	public double getPtAtaq() {
		return ptAtaq;
	}


	public void setPtAtaq(double ptAtaq) {
		this.ptAtaq = ptAtaq;
	}


	public double getPtDef() {
		return ptDef;
	}


	public void setPtDef(double ptDef) {
		this.ptDef = ptDef;
	}


	public double getDamage() {
		return damage;
	}


	public void setDamage(double damage) {
		this.damage = damage;
	}


	@Override
	public String toString() {
		return "Luchador [nombre=" + nombre + ", ptVel=" + ptVel + ", ptHP=" + ptHP + ", ptAtaq=" + ptAtaq + ", ptDef="
				+ ptDef + ", damage=" + damage + "]";
	}


	@Override
	public int compareTo(Luchador o) {
		// TODO Auto-generated method stub
		return nombre.compareToIgnoreCase(o.getNombre());
	}
	
	
	
	
	
}
