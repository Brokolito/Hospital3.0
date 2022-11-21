package Hospital;

public class Paciente extends Persona {

	public Paciente(String nombre, String apellido, String rut) {
		super(nombre,apellido,rut);
	}

	public String getTipo() {
		return "Paciente";
	}
}