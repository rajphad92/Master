package OperatorsInJava;

public class UnariyOperator {
	

	public static void main(String[] args) {
		
		// Postfix
		int i = 9;
		System.out.println(i++);//  9 (9 +1 =10)
		System.out.println(i); // 10
		
		int y = 10;
		System.out.println(y--);//10 (10-1=9)
		System.out.println(y);
		
		// Prefix
		int z = 3;
		System.out.println(--z);// (1-3 =2)
		System.out.println(z);
		
		int x = 6;
		System.out.println(++x); //(1+6=7)
		System.out.println(x);
	}

	
	
}
