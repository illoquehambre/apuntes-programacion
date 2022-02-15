package herencia_multiple_02;

public class Cardiologo {
	 static void r (IPuedeCurar x) { x.curar(); }
	 static void s (IPuedeConsultar x) { x.consultar(); }
	 static void t (IPuedeRecetar x) { x.recetar(); }
	 static void u(Cirujano x) { x.operar(); }
}
