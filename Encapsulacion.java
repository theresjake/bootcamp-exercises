public class Encapsulacion {
	public static void main(String[] args) {
		
		class Persona {
			private int edad;
			private String nombre;
			private String telefono;

			public void setEdad(int edad) {
				this.edad = edad;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public void setTelefono(String telefono) {
				this.telefono = telefono;
			}


			public int getEdad() {
				return edad;
			}

			public String getNombre() {
				return nombre;
			}

			public String getTelefono() {
				return telefono;
			}
		}

		Persona persona = new Persona();

		persona.setNombre("Santiago Stanic");
		persona.setTelefono("+58(412)123-4567");
		persona.setEdad(21);

		System.out.println(persona.getNombre()+", "+persona.getEdad()+", "+persona.getTelefono());
	}
}