package OOPs;

public class PolymorphismFindArea {
	
	public void area(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	public void area(int a) {
		int b = a*a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		PolymorphismFindArea f = new PolymorphismFindArea();
		f.area(20, 10);
		f.area(40);
	}
}
