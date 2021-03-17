package BasicProgramsNov20;

public class Global_Instance_Variable {

	//2. Global/Instance Variable

	short s = 45;
	
	public static void main(String[] args) {
		
		Global_Instance_Variable f = new Global_Instance_Variable();
		f.Bhabiji();
	}
	
	public static void babuji() {
	
	}
	
	public void Bhabiji(){
		System.out.println(s);
	}
}
