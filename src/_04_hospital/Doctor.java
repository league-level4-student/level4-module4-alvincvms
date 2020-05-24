package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	private ArrayList<Patient> p;
	
	Doctor() {
		p = new ArrayList<Patient>();
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(this.p.size() >= 3) {
			throw new DoctorFullException();
		}
		else {
			this.p.add(p);
		}
	}
	
	public ArrayList<Patient> getPatients(){
		return p;
	}
	
	public void doMedicine() {
		for(Patient p : this.p) {
			p.checkPulse();
		}
	}
}
