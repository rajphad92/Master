package AdvancedProgram;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number =  ");
		int t = sc.nextInt();
		System.out.println("Value of T is : " +t);
		
		System.out.println("Enter Second Number =  ");
		int u = sc.nextInt();
		System.out.println("Value of u is : " +u);
		
		System.out.println("Enter Third Number =  ");
		int v = sc.nextInt();
		System.out.println("Value of v is : " +v);
		
		double d = t+u+v;
		System.out.println("Addition of User Input is " +d);

	}
}
