package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		System.out.println("Digite o seu primeiro salario: ");
		salario1 = in.nextLine().replace(",", ".");
		
		System.out.println("Digite o seu segundo salario: ");
		salario2 = in.nextLine().replace(",", ".");
		
		System.out.println("Digite o seu terceiro salario: ");
		salario3 = in.nextLine().replace(",", ".");
		
		double media = ( Double.parseDouble(salario1) 
				+ Double.parseDouble(salario2) 
				+ Double.parseDouble(salario3) ) / 2;
		
		System.out.println("A média do seu salario é: " + media);
		
		
		in.close();
	}

}
