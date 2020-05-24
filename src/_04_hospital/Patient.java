package _04_hospital;

public class Patient {
	
	private boolean feelsCaredFor;
	
	Patient() {
		feelsCaredFor = false;
	}
	
	public void checkPulse() {
		feelsCaredFor = true;
	}
	
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
}
