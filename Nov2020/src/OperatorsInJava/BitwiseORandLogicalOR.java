package OperatorsInJava;

public class BitwiseORandLogicalOR {

	public static void main(String[] args) {
		
		float w = 12.99f;
		float e = 11.99f;
		float n = 5;

		System.out.println(w>e | n>e); // True OR False
		System.out.println(w>e || n>e); // True OROR False
		System.out.println(n>e || w<e); // false OROR false
		System.out.println(n>e || w>e); // false OROR True
	}
}
