package OOPs;

public class FamilyFatherSon {

	public static void main(String[] args) {

		//Down casting
		Father g =new Son(); // up casting 
		 //Son a = g;
		Son a = (Son)g;// Down casting 
		a.bike();
		a.job();
		a.fjob();
		a.land();
		a.home();
		a.gold();
	}
}
