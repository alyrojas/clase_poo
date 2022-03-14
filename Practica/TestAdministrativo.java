public class TestAdministrativo {
	public static void main (String [] args) {
		
		Administrativo p1 = new Administrativo();
		p1.nombre = "Alyne";
		p1.apellidos = "Rojas";
		p1.genero = "Femenino";
		p1.curp = "ROG2";
		p1.numEmpleado = "123";
		p1.oficina = "CGTI";

		System.out.println(p1);
		System.out.println("");

		Administrativo p2 = new Administrativo();
		p2.nombre = "Elizabeth";
		p2.apellidos = "Rojas";
		p2.genero = "Femenino";
		p2.curp = "ROG3";
		p2.numEmpleado = "1234";
		p2.oficina = "TICS";
		

		System.out.println(p2);
		
		
	}
}