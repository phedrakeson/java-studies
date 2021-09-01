package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
//		Domingo = 1, quarta = 4, terça = 3, quinta = 5, sexta = 6
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		String diaSemana = in.nextLine();
		
		if(diaSemana.equalsIgnoreCase("domingo")) 
			System.out.println("1");
		if(diaSemana.equalsIgnoreCase("segunda")) 
			System.out.println("2");
		if(diaSemana.equalsIgnoreCase("terça")) 
			System.out.println("3");
		if(diaSemana.equalsIgnoreCase("quarta")) 
			System.out.println("4");
		if(diaSemana.equalsIgnoreCase("quinta")) 
			System.out.println("5");
		if(diaSemana.equalsIgnoreCase("sexta")) 
			System.out.println("6");
		if(diaSemana.equalsIgnoreCase("sabado")) 
			System.out.println("7");
		
		in.close();
	}

}
