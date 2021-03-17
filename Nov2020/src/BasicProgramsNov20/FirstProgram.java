package BasicProgramsNov20;

public class FirstProgram {
	
	// Creation of Object/ Object Creation 
	
	public static void blueBottol() {
		System.out.println("I have blue bottle in my hand");
	}
	
	public void redbottole() {
		System.out.println("I have red bottle in my hand");
	}

	public static void main(String[] args) {		
		// classname referenceVariable = new [classname() - CONSTRUCTOR];
		blueBottol();
		FirstProgram d1 = new FirstProgram();
		
		d1.redbottole();	
		
		
	}
	
	
	
}
