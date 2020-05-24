package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private ArrayList<Doctor> d;
	private ArrayList<Patient> p;
	
	Hospital(){
		d = new ArrayList<Doctor>();
		p = new ArrayList<Patient>();
	}
	
	public List<Doctor> getDoctors(){
		return (List) d;
	}
	
	public void addDoctor(Doctor d) {
		this.d.add(d);
	}
	
	public List<Patient> getPatients(){
		return (List) p;
	}
	
	public void addPatient(Patient p) {
		this.p.add(p);
	}
	
	
}
