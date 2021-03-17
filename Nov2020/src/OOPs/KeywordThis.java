package OOPs;

public class KeywordThis {

	int a = 20;
	int b = 30;

	public void math() {
		int a = 40;
		int b = 50;
		System.out.println(this.a);//20
		System.out.println(this.b);//30
		System.out.println(a);//40
		System.out.println(b);//50
	}
	public static void main(String[] args) {
		KeywordThis t = new KeywordThis();
		t.math();
	}
}
