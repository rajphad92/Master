package BasicProgramsNov20;

public class ConstOne {

	String name;
	int t ;
	// Declaration Of Constructor and Initialization
	ConstOne(){
		name = "Datta";
		t = 143;
		System.out.println(name);
		System.out.println(t);
		short s = 67;
		System.out.println(s);
	}
	public static void main(String[] args) {
		new ConstOne();
	}
}
