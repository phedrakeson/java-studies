package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println("Nova linha");
		System.out.println(" teste");
		
		System.out.printf("Megasena: %d %d %d %d %d", 1, 23, 34, 22, 69);
		System.out.printf("Salario: %.1f", 123444.331232231);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		
		String conteudoDigitado = entrada.nextLine();
		
		System.out.println("Digite a sua idade");
		int idade = entrada.nextInt();
		entrada.nextLine(); // para ler o /n que é escapado ao apertar ENTER		
		
		System.out.printf("Bem vindo %s você tem %d anos", conteudoDigitado, idade);
		entrada.close();
	}

}
