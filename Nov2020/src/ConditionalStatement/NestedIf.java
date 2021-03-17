package ConditionalStatement;

public class NestedIf {

	public static void main(String[] args) {


		// 3. Standard Syntax for Nested If Else Statement 		
		//		if (Condition1) {
		//			statement(s);
		//                if (Condition2) {
		//			statement(s);
		//      }
		//		}

		int c = 60;

		if (c<100) {
			System.out.println(" Number is less than Hundred");
			if (c<50) {
				System.out.println(" Number is greater than Fifty");
			}		
		}
		System.out.println(" Not Valid");
	}
}
