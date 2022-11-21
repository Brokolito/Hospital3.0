package Hospital;

public class Doctor extends Persona {
	private Especialidad especialidad;
	public Especialidad unnamed_Especialidad_;

	public Doctor(String nombre, String apellido, String rut, Especialidad especialidad) {
		super(nombre,apellido,rut);
		this.especialidad=especialidad;
	}

	public Especialidad getEspecialidad() {
		return this.especialidad;
	}

	public String getTipo() {
		return "Doctor";
	}
}