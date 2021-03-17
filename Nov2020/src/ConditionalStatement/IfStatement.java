package ConditionalStatement;


public class IfStatement {

	public static void main(String[] args) {
		// Standard Syntax for If  Statement 		
		//		if (Condition) {
		//			statement(s);
		//		}
		int no = 1; 
		//if no is greater than zero then print Positive number if not then print negative 

		if (no >0) {
			System.out.println("Number is positive");
		}
		IfStatement b = new IfStatement();
		b.condition2();
		b.condition3();
	}
	public void condition2() {
		int a = -5;
		if (a>0 && a<0) {
			System.out.println("User Entered Negative Number");
		}
		System.out.println("You Have Entenered Wrong Number");
	}
	
	public void condition3() {
		int a = 10;
		if (a>0 & a<=10) {
			System.out.println("User Entered Positive Number");
		}
		System.out.println("You Have Entenered Wrong Number");
	}
}
