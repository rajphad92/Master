package LoopsInJavaProgram;

public class NestedForLoop {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=3; i++) { //1 (2), 1 (2), 1 (2), 2 (3),
			for (int j =1; j<=3; j++) { //1 (2), 2 (3), 3 ,1 (2)
				
				System.out.println(i+" "+j);
			}
		}
	}
}
// 1 1
// 1 2
// 1 3
// 2 1
// 2 2
// 2 3
// 3 1
// 3 2
// 3 3