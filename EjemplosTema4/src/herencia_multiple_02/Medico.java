package herencia_multiple_02;

public class Medico extends Cirujano implements IPuedeCurar, IPuedeConsultar,
IPuedeRecetar {

 public void curar() { System.out.println("Medico.curar()"); }
 public void consultar() { System.out.println("Medico.consultar()"); }
 public void recetar() { System.out.println("Medico.recetar()"); }
}
