package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next()); // int primitivo
		Long l = 100000L;
		
		b.byteValue();
		s.toString();
		System.out.println(i * 3);
		
		entrada.close();
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5674;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		

		Character c = '#';
		
		System.out.println(c.toString() + "...");
		
	}

}
