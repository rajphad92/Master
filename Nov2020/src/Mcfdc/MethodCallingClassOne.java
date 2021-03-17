package Mcfdc;

public class MethodCallingClassOne {
	
	public static void main(String[] args) {
		MethodCallingClassTwo.test1();
		MethodCallingClassTwo b = new MethodCallingClassTwo();
		b.test2();
		MethodCallingClassThree.test3();
		MethodCallingClassThree c = new MethodCallingClassThree();
		c.test4();
	}
}
	
