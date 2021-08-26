package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao2);
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("comprou TV 32\"?" + comprouTV32);
		System.out.println("comprou sorvete?" + comprouSorvete);
		System.out.println("está mais saudavel?" + !comprouSorvete);
	}

}
