package Hospital;
public enum Especialidad {
	PEDIATRIA("Pediatria"),
	TRAUMATOLOGIA("Traumatologia"),
	DERMATOLOGIA("Dermatologia"),
	OFTALMOLOGIA("Oftalmologia");
	private String especialidad;

	private Especialidad(String especialidad) {
		this.especialidad=especialidad;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}
}