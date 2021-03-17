package BasicProgramsNov20;

public class TypesOfVariables {
	
	public static void main(String[] args) {
		
		int c = 987;
		one();
		TypesOfVariables v = new TypesOfVariables();
		v.two();
		System.out.println(c);
	}
	
	
	// 1. Local Variable
	public static void one() {
		int a = 143;
		System.out.println(a);
	}
	
	public void two() {
		int a = 123;
		System.out.println(a);
	}
	
}
