package AdvancedProgram;

import java.util.Scanner;

public class TakingUserInputString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// System.in is static input stream
		System.out.println("Enter your name = ");
		String Name = sc.nextLine();
		System.out.println("Your Name is = " + Name);
	}

}
