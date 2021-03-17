package BasicProgramsNov20;

public class SecondProgram {

	//Methods(Member Function)

	// 1. Main Method
	public static void main(String[] args) {
		System.out.println("Main Method is Running");
		testOne();
		testThree();
		testFour();
		
		SecondProgram k12345 = new SecondProgram();
		k12345.testTwo();
		//testTwo();
	}

	// 2. Regular/Business Method 

	// a. Static Method 
	public static void testOne() { // Main Method 
		System.out.println("Static One Method is Running");
	}

	public static void testThree() {

		System.out.println("Static Three Method is Running");
	}

	public static void testFour() {
		System.out.println("Static Four Method is Running");

	}
	// b. Non- Static Method
	public void testTwo() {
		System.out.println("Static Two Method is Running");
	}		
}
