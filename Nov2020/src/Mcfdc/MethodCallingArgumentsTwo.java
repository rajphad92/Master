package Mcfdc;

public class MethodCallingArgumentsTwo {

	public static void main(String[] args) {
		MethodCallingArgumentsOne v = new MethodCallingArgumentsOne();
		v.scorpio();
		v.scorpio(1200000);
		MethodCallingArgumentsTwo c = new MethodCallingArgumentsTwo();
		c.ertiga();
		c.ertiga(900000);
	}
	public void ertiga() {
		System.out.println("ertiga zero args method is running");
	}
	public void ertiga(int price) {
		System.out.println("ertiga method with onw argument is running");
	}
}
