package ConditionalStatement;

public class IfElseIfStatement {

	public static void main(String[] args) {
		
		
		int marks = 20;
		
		if (marks >=65) {System.out.println(" Distinction ");}
		else if (marks >=60 && marks <65) { System.out.println(" First Class ");}
		else if (marks >=55 && marks <60) { System.out.println(" Higher Second Class ");}
		else if (marks >=50 && marks <55) { System.out.println(" Second Class ");}
		else if (marks >=40 && marks <50) { System.out.println(" Pass ");}
		else { System.out.println(" Fail ");}
	}

}
