public class Herencia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		cliente.setNombre("Daniel Pérez");
		cliente.setEdad(25);
		cliente.setTelefono("+58(424)7654-321");
		cliente.setCredito(45.21f);

		System.out.println("DATOS DEL CLIENTE Nombre: "+cliente.getNombre()+", Edad: "+cliente.getEdad()+", Teléfono: "+cliente.getTelefono()+", Crédito: "+cliente.getCredito()+"$");



		Trabajador trabajador = new Trabajador();

		trabajador.setNombre("Sebastián Gómez");
		trabajador.setEdad(31);
		trabajador.setTelefono("+58(412)1515-151");
		trabajador.setSalario(120f);

		System.out.println("DATOS DEL TRABAJADOR Nombre: "+trabajador.getNombre()+", Edad: "+trabajador.getEdad()+", Teléfono: "+trabajador.getTelefono()+", Salario: "+trabajador.getSalario()+"$");

	}
}

class Persona {
	private int edad;
	private String nombre;
	private String telefono;

	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}


	public int getEdad(){
		return edad;
	}
	public String getNombre(){
		return nombre;
	}
	public String getTelefono(){
		return telefono;
	}
}

class Cliente extends Persona {
	private float credito;


	public void setCredito(float credito){
		this.credito = credito;
	}

	public float getCredito(){
		return credito;
	}

}

class Trabajador extends Persona {
	private float salario;


	public void setSalario(float salario){
		this.salario = salario;
	}

	public float getSalario(){
		return salario;
	}

}
