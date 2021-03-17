package AdvancedProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		//int n = 687;
		for (int i =687; i<=786; i++) {
			if (i==786) {
			System.out.println(i);
		}
	}
		ReverseNumber r = new ReverseNumber();
		r.reverseanyno();		
}
	public void reverseanyno() {
		int m = 521;
		int s = 0;
		int t;
		while (m>0) {
			t = m%10;// 1, 2, 5
			s = s*10 +t; //1, (1*10+ 2 = 12), ( 12*10 + 5= 125)
			m = m/10;//52, 5, 0
		}
		
		System.out.println(s);
	}

}
