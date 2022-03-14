public class Persona{
	public String nombre;
	public String apellidos;
	public String genero;
	public String curp;
	
	Persona(){
		System.out.println("Construyendo Persona");
	}
	
	Persona(String pNombre){
		this.nombre= pNombre;
		this.apellidos= "";
		this.genero= "";
		this.curp= "";
	}
	
	public String toString(){
		System.out.println(" ");
		return "Nombre: " + this.nombre +
			"\nApellidos: " + this.apellidos +
			"\nGenero: " + this.genero +
			"\nCURP: " + this.curp;
	}
}