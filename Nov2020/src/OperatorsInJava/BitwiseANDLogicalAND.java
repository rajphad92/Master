package OperatorsInJava;

public class BitwiseANDLogicalAND {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 14;
		int c = 7;
		System.out.println( c>a  & b>a );  // 
		System.out.println( c>a  && b>a ); // false && true
		System.out.println(  b>a &&  c>a ); // true && false
	}
}
