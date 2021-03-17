package Mcfdc;

public class MethodCallingClassThree {
	
	public static void test3() {
		System.out.println("Test3 Static method is running");
	}
	
	
	public  void test4() {
		System.out.println("Test4 Non Static method is running");
	}

	
	public static void main(String[] args) {
		MethodCallingClassTwo.test1();
		MethodCallingClassTwo b = new MethodCallingClassTwo();
		b.test2();
		test3();
		MethodCallingClassThree c = new MethodCallingClassThree();
		c.test4();
	}
}
