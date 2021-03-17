package OOPs;

public class InterfaceImplemenatation implements InterfaceRequirements {
	
	public void method1() {
		System.out.println("Implemenatation of Method1");
	}
	public void method2() {
		System.out.println("Implemenatation of Method2");
	}
	
	public static void main(String[] args) {
		InterfaceImplemenatation h = new InterfaceImplemenatation();
		h.method1();
		h.method2();
		
	}
}
