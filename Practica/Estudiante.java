public class Estudiante extends Persona{
	public String numeroControl;
	public String carrera;

	Estudiante () {
		System.out.println("Construyendo Estudiante");

	}
	
	Estudiante(String pNumeroControl) {
		super();
		this.numeroControl = pNumeroControl;
		this.carrera = "";
		
	}

	public String toString() {
		System.out.println(" ");
		return super.toString()+
		"\nNumero Numero Control: " + this.numeroControl +
			"\nCarrera: " + this.carrera;
	}
}