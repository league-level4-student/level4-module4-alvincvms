package _01_introduction_to_encapsulation;

public class Test {
	EncapsulateTheData e = new EncapsulateTheData();;
	public static void main(String[] args) {
		new Test().test();
	}
	
	void test() {
		e.setDegreesTurned((float)-0.1);
		System.out.println(e.getDegreesTurned());
		e.setItemsReceived(-1);
		System.out.println(e.getItemsReceived());
		e.setMemberObj("hello world");
		System.out.println(e.getMemberObj());
		e.setNomenclature("");
		System.out.println(e.getNomenclature() + "test");
	}
}
