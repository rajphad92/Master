package BasicProgramsNov20;

public class ConstThisWithArgument {
	
	// This Keyword
	
	int a = 10;
	
	public void test() {
		int a = 20;
		System.out.println(a);// 20
	    System.out.println(this.a);// 10
	}
	
	public static void main(String[] args) {
		
		ConstThisWithArgument v = new ConstThisWithArgument();
		v.test();
	}
}
