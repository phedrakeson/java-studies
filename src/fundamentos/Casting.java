package fundamentos;

import javax.swing.JOptionPane;

public class Casting {

	public static void main(String[] args) {
		double a = 1; // convers�o implicita
		System.out.println(a);
		
		float b = (float) 1.123131233345; // convers�o explicita (casting)
		System.out.println(b);
		
		int c = 128;
		
		byte d = (byte) c;
		
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e;
		System.out.println(f);
		
		
		
		// Convers�o numero > string
		
		Integer num1 = 10000;
		num1.toString();
		
		int num2 = 1000000;
		Integer.toString(num2);
		
		System.out.println("" + num2);
		
		
		// Convers�o string > numero
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro numero");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma / 2);
		
	}

}
