package Hospital;

import java.util.ArrayList;
import Hospital.Doctor;
import Hospital.Paciente;

public class Hospital {
	private ArrayList<Doctor> doctores = new ArrayList<Doctor>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	public void addPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}

	public void addMedico(Doctor doctor) {
		doctores.add(doctor);
	}

	public Paciente buscarPaciente(String rut) {
		for(Paciente paciente:this.pacientes){
			if(paciente.getRut().equals(rut)){
				return paciente;
			}
		}
		return null;
	}

	public Doctor buscarDoctor(String rut) {
		for(Doctor doctor:this.doctores){
			if(doctor.getRut().equals(rut)){
				return doctor;
			}
		}
		return null;
	}

	public void removePaciente(Paciente paciente) {
		pacientes.remove(paciente);
	}

	public void removeDoctor(Doctor doctor) {
		doctores.remove(doctor);
	}
}