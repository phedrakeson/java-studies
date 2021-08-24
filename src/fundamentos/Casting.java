package fundamentos;

import javax.swing.JOptionPane;

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
		
		
		// Conversão string > numero
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro numero");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
		
	}

}
