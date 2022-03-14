public class Docente extends Persona{
	public String numEmpleado;
	public String especialidad;
	public String carrera;

	Docente () {
		System.out.println("Construyendo Docente");

	}
	
	Docente (String pNumEmpleado) {
		super();
		this.numEmpleado = pNumEmpleado;
		this.especialidad = "";
		this.carrera = "";
		
	}

	public String toString() {
		System.out.println(" ");
		return super.toString()+
		"\nNumero Empleado: " + this.numEmpleado +
			"\nEspecialidad: " + this.especialidad +
			"\nCarrera: " + this.carrera;
	}
}