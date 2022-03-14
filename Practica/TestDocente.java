public class TestDocente {
	public static void main (String [] args) {
		
		Docente p1 = new Docente();
		p1.nombre = "Alyne";
		p1.apellidos = "Rojas";
		p1.genero = "Femenino";
		p1.curp = "ROG2";
		p1.numEmpleado = "123";
		p1.especialidad = "POO";
		p1.carrera = "Programacion";

		System.out.println(p1);
		System.out.println("");

		Docente p2 = new Docente();
		p2.nombre = "Elizabeth";
		p2.apellidos = "Rojas";
		p2.genero = "Femenino";
		p2.curp = "ROG3";
		p2.numEmpleado = "1234";
		p2.especialidad = "Hackeo";
		p2.carrera = "Redes";
		

		System.out.println(p2);
		
		
	}
}