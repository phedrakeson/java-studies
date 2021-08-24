package fundamentos;

public class Casting {

	public static void main(String[] args) {
		double a = 1; // conversão implicita
		System.out.println(a);
		
		float b = (float) 1.123131233345; // conversão explicita (casting)
		System.out.println(b);
		
		int c = 128;
		
		byte d = (byte) c;
		
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e;
		System.out.println(f);
		
		
		
		// Conversão numero > string
		
		Integer num1 = 10000;
		num1.toString();
		
		int num2 = 1000000;
		Integer.toString(num2);
		
		System.out.println("" + num2);
	}

}
