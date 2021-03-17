package InterfaceProgram;

public class PhonePayImplementation implements BankFunctionalDetails1, BankFunctionalDetails2, BankFunctionalDetails3 {

	@Override
	public void aadharcard() {
		System.out.println(c);

	}

	@Override
	public void UPI() {
		System.out.println(t);

	}

	@Override
	public void mobileno() {
		System.out.println(t);

	}

	@Override
	public void panNo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void accountno() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		// test(); // 1. Directly calling by method name with method signature 
		BankFunctionalDetails1.test();// 2. Using classname/interface dot method name with method signature 

		PhonePayImplementation p = new PhonePayImplementation();
		p.UPI();
		p.mobileno();
		p.aadharcard();
		p.panNo();
		p.accountno();
		System.out.println(s);

		BankFunctionalDetails3 t = new PhonePayImplementation();
		t.panNo();
		t.accountno();
		System.out.println(s);
	}

}
