package OOPs;

public class AbstractionSantosh extends Person {


	public void info() {
		String Name = " Santosh Deshmukh ";
		String Gender = "Male";
		String Education = "B.E.";
		int Age = 32;

		System.out.println(Name + " "+Gender+ " "+Education+" "+Age);
	}
	public void company() {	}
	public static void main(String[] args) {
		AbstractionArchana p = new AbstractionArchana();
		p.behaviour();
		p.info();

		Person t = new AbstractionSantosh();
		t.info();
		t.behaviour();
	}
}
