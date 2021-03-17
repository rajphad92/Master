package BasicProgramsNov20;

public class StaticVariable {

	// 3. Static Variable 

	static int salary = 50000;
	static double yearlyincome = 1000000;

	public static void neelam() {
		System.out.println(salary);
		System.out.println(yearlyincome);
	}
	
	public void sneha() {
		System.out.println(salary);

	}

	public static void main(String[] args) {
		
		neelam();
		StaticVariable f = new StaticVariable();
		f.sneha();
	}

	
	
}
