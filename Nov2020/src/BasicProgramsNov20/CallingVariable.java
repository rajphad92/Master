package BasicProgramsNov20;

public class CallingVariable {

// 
	int a = 20;

	int b = 30;

	public void Aone(int c, int d) {

//		this.a = c;
//		this.b = d;
//		a = c;
//		b = d;
		c = a;
		d = b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
	}
	public void Aone() {
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		CallingVariable d = new CallingVariable();
		d.Aone(5,5);
		d.Aone();
	}
}
