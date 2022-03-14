public class Administrativo extends Persona{
	public String numEmpleado;
	public String oficina;

	Administrativo () {
		System.out.println("Construyendo Administrativo");

	}
	
	Administrativo(String pNumEmpleado) {
		super();
		this.numEmpleado = pNumEmpleado;
		this.oficina = "";
		
	}

	public String toString() {
		System.out.println(" ");
		return super.toString()+
		"\nNumero Empleado: " + this.numEmpleado +
			"\nOficina: " + this.oficina;
	}
}