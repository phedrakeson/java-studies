package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		var x = 34.53;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x /  y);
		System.out.println(x * y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a / (double) b);
		System.out.println(8 % 3);
		
		int c = 3 * 4 - 10;
		int d = (int)Math.pow(c, 3);
		System.out.println(d);
		
		
		// Resolução desafio
		
		double expressao1 = Math.pow( (6 * (3+2)), 2) / 3*2;
		double expressao2 = Math.pow( ((1-5) * (2-7)), 2) / 2;
		double divisorGeral = Math.pow(10, 3);
		System.out.println(expressao1 + ' ' + expressao2);
		double formula = Math.pow(
				( expressao1 - (expressao2) ), 3) / divisorGeral;
		
		System.out.println(formula);
		
		double numA = Math.pow(6 * (3+2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB , 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
	}

}
