package ConditionalStatement;

public class NestedIfelse {

	public static void main(String[] args) {
		// 4. Standard Syntax for Nested If Else Statement 		
		//		if (Condition) {
		//			statement(s);
		// if (Condition) {
		// statement(s);
		//   }
		// else {
		//       }
		//		}
		// else {
		//		statement(s);
		//		}

		String un = "SantoshRao";
		String pwd = "Santosh143";
		
		
		if (un == "SantoshRao") {
			if (pwd == "Santosh14333" ) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("You have Entered Wrong Paasword");
			}
		}
		else {
			System.out.println("You have Entered Wrong Username");
		}
	}

}
