package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	
	public static void main(String[] args) {
		

	}

}
