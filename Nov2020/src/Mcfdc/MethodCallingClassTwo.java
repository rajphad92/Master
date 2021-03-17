package Mcfdc;

public class MethodCallingClassTwo {
	
	public static void test1() {
		System.out.println("Test1 Static method is running");
	}
	
	public  void test2() {
		System.out.println("Test2 Non Static method is running");
	}
	
	public static void main(String[] args) {
		test1();
		MethodCallingClassTwo b = new MethodCallingClassTwo();
		b.test2();
		MethodCallingClassThree.test3();
		MethodCallingClassThree c = new MethodCallingClassThree();
		c.test4();
	}
}
