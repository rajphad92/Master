package AdvancedProgram;

public class StarPattern {


	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(); // new line
		}	
		StarPattern f = new StarPattern();
		f.pyramiddown();

	}

	public void pyramiddown() {
		int t = 5;

		for (int i=1; i<=t; i++) {
			for (int j=t; j>=i; j--) { 
				System.out.print("* ");
			}
			System.out.println(); // new line
		}	

	}

}
//1 5, 1 4, 1 3, 1 2, 1 1,
//2 5, 2 4, 2 3, 2 2,
//3 5, 3 4, 3 3,
//4 5, 4 4,
//5 5

// 1 1
// 2 1 
// 2 2
// 3 1
// 3 2
// 3 3
// 4 1
// 4 2
// 4 3
// 4 4




