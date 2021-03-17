package BasicProgramsNov20;

public class VariableDeclaration {
	
	// Given Steps
	
	// 1. Declaration
	
	int engMarks;
	int mathMark;
	int chemMarks;
	
	
	// 2. Initialization
	
	public void aarti() {
		engMarks = 75;
		mathMark = 75;
		chemMarks = 45;
		System.out.println("English Marks = "+ engMarks);
		System.out.println("Math Marks = " + mathMark);
		System.out.println("Chemestry Marks = " + chemMarks);
		
	}
	
	public void digambar() {
		engMarks = 95;
		mathMark = 150;
		chemMarks = 99;
		
		System.out.println("English Marks = "+ engMarks);
		System.out.println("Math Marks = " + mathMark);
		System.out.println("Chemestry Marks = " + chemMarks);
	}
	
	public void sayali() {
		engMarks = 99;
		mathMark = 149;
		chemMarks = 100;
		System.out.println("English Marks = "+ engMarks);
		System.out.println("Math Marks = " + mathMark);
		System.out.println("Chemestry Marks = " + chemMarks);
	}
	
	
	//3. Usage
	 public static void main(String[] args) {		 
		 VariableDeclaration vd = new VariableDeclaration();
		 System.out.println("Marks of Aarti are given below");
		 vd.aarti();
		 System.out.println("Marks of Digamber are given below");
		 vd.digambar();
		 System.out.println("Marks of Sayali are given below");
		 vd.sayali();
	}
}
