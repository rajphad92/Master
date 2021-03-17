package OOPs;

public class KeywordSuper extends KeywordThis{

	int a = 50;
	int b = 60;

	public void math1() {
		System.out.println(a);//50
		System.out.println(b);//60
		System.out.println(super.a);//20
		System.out.println(super.b);//30
	}
	public static void main(String[] args) {
		KeywordSuper k = new KeywordSuper();
		k.math1();
		k.math();
	}

}
