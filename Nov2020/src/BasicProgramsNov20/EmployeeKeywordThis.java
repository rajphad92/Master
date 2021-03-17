package BasicProgramsNov20;

public class EmployeeKeywordThis {
	// Declaration
	int empID;
	String empName;
	
	int dob = 2551994;
	
	// Initialization
	EmployeeKeywordThis(){
		empID = 178;
		empName = "Swati";
	}
	EmployeeKeywordThis(int id, String name){
		empID = id;// 786
		empName = name;// Aarchna
		int dob1 = 26619947;
		System.out.println(dob1);
		dob = dob1;// 2551994 = 26619947
		System.out.println(dob);
		
	}
	// Usage
	public void information() {
		System.out.println("ID: " +empID+ " Canditate Name: "+empName);
	}
	public static void main(String[] args) {
		EmployeeKeywordThis g = new EmployeeKeywordThis();
		g.information();
		
		EmployeeKeywordThis t = new EmployeeKeywordThis(786, "Aarchna");
		System.out.println(t.empID);
		System.out.println(t.empName);
	}
}
