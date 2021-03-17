package OOPs;

public class CastingCoversion {
	// Converting one type of information into another type of information is known as casting
	// 1. Primitive Casting - Converting one data type information into another datatype information
	// Boolean - 1 bit, byte - 1 byte, char - 2 byte, int - 4 byte, short - 2 byte, Long - 8 byte
	// float - 4 byte, 	double - 8 byte 

	//		i) Implicit Casting - Converting lower data type information into higher data type information
	//		byte - 1 byte
	//		short - 2 byte
	//		int - 4 byte
	//		float - 4 byte
	//		Long - 8 byte
	//		double - 8 byte 
	public static void main(String[] args) {


		byte b = 20; // -128 to +127 (1 byte) Lower Data Type

		short s = b;

		System.out.println(s); // Implicit Casting


		int f = 400; // (4byte)
		long h = f;
		System.out.println(h);// Implicit Casting

		short p = 10000; // (2byte)
		long v = p;
		System.out.println(v);// Implicit Casting
		
		
		
		long e = 345;
		int y = (int) e;
		System.out.println(y);
		
		float m = 34.35f;
		short n = (short)m;
		System.out.println(n);
		
	}
}
