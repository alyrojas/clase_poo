public class TestEstudiante {
	public static void main (String [] args) {
		
		Estudiante p1 = new Estudiante();
		p1.nombre = "Alyne";
		p1.apellidos = "Rojas";
		p1.genero = "Femenino";
		p1.curp = "ROG2";
		p1.numeroControl = "123";
		p1.carrera = "Programacion";

		System.out.println(p1);
		System.out.println("");

		Estudiante p2 = new Estudiante();
		p2.nombre = "Elizabeth";
		p2.apellidos = "Rojas";
		p2.genero = "Femenino";
		p2.curp = "ROG3";
		p2.numeroControl = "1234";
		p2.carrera = "Redes";
		

		System.out.println(p2);
		
		
	}
}