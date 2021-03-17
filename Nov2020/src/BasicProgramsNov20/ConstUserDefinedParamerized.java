package BasicProgramsNov20;

public class ConstUserDefinedParamerized {
	
	// Zero Argument Constructor
	ConstUserDefinedParamerized(){
		System.out.println("Zero Argument Constructor is running");
	}
	
	// One Argument Constructor
	ConstUserDefinedParamerized(String a){ // String a = "One Const"; 
		int y = 20;
		int b = 30;
		int c = y+b;
		System.out.println("Value of C = " +c);
	}
	
	// Two Argument Constructor
	ConstUserDefinedParamerized(String b, char c){
		System.out.println("Two Argument Constructor is running");
	}
	
	// Three Argument Constructor
	ConstUserDefinedParamerized(String e, int d, double r){
		System.out.println("Three Argument Constructor is running");
	}
	
	public static void main(String[] args) {
		
		String a = "Sneha";
		String e = "Digamber";
		int d = 786;
		double r = 999;		
		
		new ConstUserDefinedParamerized();
		new ConstUserDefinedParamerized("One Const");
		new ConstUserDefinedParamerized("Aarti", 'f');
		new ConstUserDefinedParamerized("Shubham", 77, 6789098765d);
	}
	
}
