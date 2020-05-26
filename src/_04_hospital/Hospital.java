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
		return (List<Doctor>) d;
	}
	
	public void addDoctor(Doctor d) {
		this.d.add(d);
	}
	
	public List<Patient> getPatients(){
		return (List<Patient>) p;
	}
	
	public void addPatient(Patient p) {
		this.p.add(p);
	}
	
	public void assignPatientsToDoctors() {
		int x = 0;
		for(int i = 0; i < d.size(); i++) {
			for(int j = x; j < p.size(); j++) {
				if(d.get(i).getPatients().size() < 3) {
					try {
						d.get(i).assignPatient(p.get(j));
					} catch (DoctorFullException e) {
						
					}
				}
				else {
					x = j;
					break;
				}
			}
		}
	}
}
