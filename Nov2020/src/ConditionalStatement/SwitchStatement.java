package ConditionalStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		// 6. Std. Syntax of Switch Statement
		// Switch ( Variable or an integer Expression)
		// {
		// case constant : // Java Code; break;
		// case constant : // Java Code; break;
		// case constant : // Java Code; break;
		// case constant : // Java Code; break;
		// case constant : // Java Code; break;
		// default : // Java Code;
		int day = 3;
		switch(day) {
		case 1: System.out.println("Today is Monday"); break;
		case 2: System.out.println("Today is Tuesday"); break;
		case 3: System.out.println("Today is Wednesday"); break;
		case 4: System.out.println("Today is Thursday"); break;
		case 5: System.out.println("Today is Friday"); break;
		case 6: System.out.println("Today is Saturday"); break;
		case 7: System.out.println("Today is Sunday"); break;
		default : System.out.println("Wrong day"); break;
	}
		stringswitch();
}
	
	public static void stringswitch() {
		String s = "Two";
		switch(s) {
		case "One": System.out.println("Today is Monday"); break;
		case "Two": System.out.println("Today is Tuesday"); break;
		case "Three": System.out.println("Today is Wednesday"); break;
		case "Four": System.out.println("Today is Thursday"); break;
		case "Five": System.out.println("Today is Friday"); break;
		case "Six": System.out.println("Today is Saturday"); break;
		case "Seven": System.out.println("Today is Sunday"); break;
		default : System.out.println("Wrong day"); break;
		}
	}
}