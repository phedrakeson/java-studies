package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		System.out.println("Digite o seu primeiro salario: ");
		salario1 = in.nextLine();
		
		System.out.println("Digite o seu segundo salario: ");
		salario2 = in.nextLine();
		
		System.out.println("Digite o seu terceiro salario: ");
		salario3 = in.nextLine();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		
		double media = ( Double.parseDouble(salario1) 
				+ Double.parseDouble(salario2) 
				+ Double.parseDouble(salario3) ) / 2;
		
		System.out.println("A média do seu salario é: " + media);

	}

}
