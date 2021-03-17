package OOPs;

public class EncapsulTest {
	
	private double balance;//2. 1000000
	
	public double getBalance() {
		return balance;	//3. 1000000
	}
	public void setBalance(double balanceone) {
		
		balance = balanceone; //1.1000000
	}
	public static void main(String[] args) {
		System.out.println(" ***Welcome to SBI Bank*** ");
		EncapsulTest t = new EncapsulTest();
		t.setBalance(1000000);
		System.out.println(" Your Balance is = "+t.getBalance());
	}
}
