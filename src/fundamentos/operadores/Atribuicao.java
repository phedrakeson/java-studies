package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = b - a;
		
		c += b; // c = c + b
		c -= a; // c = c - b
		c *= b; // c = c * b
		c /= a; // c = c / a
		c %= 2; // c = c % 2 | retorna 0: par OU 1: impar

	}

}
