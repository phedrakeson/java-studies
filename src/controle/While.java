package controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("Bom dia");
			contador++;
		}
		
		Scanner in = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("fala alguma coisa");
			valor = in.nextLine();
		}
		
		in.close();

	}

}
