package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = in.nextDouble();
		
		System.out.println("Digite a operação: ");
		String oper = in.next();
		
		double resultado = "+".equals(oper) ? num1 + num2 : 0;
		resultado = "-".equals(oper) ? num1 - num2 : resultado;
		resultado = "*".equals(oper) ? num1 * num2 : resultado;
		resultado = "/".equals(oper) ? num1 / num2 : resultado;
		resultado = "%".equals(oper) ? num1 % num2 : resultado;
		
		System.out.printf("O resultado do calculo é: " + resultado);
		

	}

}
