package AdvancedProgram;

public class PrimeNumber {

	public static void main(String[] args) {
	int n = 234;
	int c = 0;
	
	for (int i =2; i<n; i++) { //
		
		if (n%i ==0) { // 0
			c++;
			break;
		}
	}
		if (c ==0) {
			System.out.println(" Number is Prime");
		}
		else {
			System.out.println(" Number is not Prime");
		}
	}
	}

