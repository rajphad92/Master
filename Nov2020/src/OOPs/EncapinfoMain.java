package OOPs;

public class EncapinfoMain {

	public static void main(String[] args) {
		System.out.println(" *** Your Information is here ***");
		
		Encapinfo  p = new Encapinfo();
		p.setName("Dhiraj");
		System.out.println("Your Name is = "+p.getName());
		p.setId("AB123");
		System.out.println("Your ID is = "+p.getId());
		p.setAge(25);
		System.out.println("Your Age is = "+p.getAge());
	}

}
