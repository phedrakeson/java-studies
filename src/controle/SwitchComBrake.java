package controle;

import java.util.Scanner;

public class SwitchComBrake {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		
		String conceito = "";
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		default:
			conceito = "Não informado";
		}
		
		System.out.println("Conceito é: " + conceito);
		
		entrada.close();

	}

}
