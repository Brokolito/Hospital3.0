package Hospital;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String rut;

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public Persona(String nombre, String apellido, String rut) {
		throw new UnsupportedOperationException();
	}

	public abstract String getTipo();
}