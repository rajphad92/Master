package LoopsInJavaProgram;

public class WhileLoop {

	public static void main(String[] args) {
		int u = 1;
		
		while (u<=10) {
			System.out.println(u);
			u++;
		}
		chilama();
	}	
	public static void chilama() {
		
		int i = 10;
		while (i>0) {
			System.out.println(i);
			i--;
		}
	}
		public static void chilakama() {
			
			int k = 1;
			
			do {
				System.out.println(k);
				k++;
			} while (k<=9);
			
	}
}
