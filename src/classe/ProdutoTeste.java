package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Pa�oca";
		p1.preco = 14.32;
		p1.desconto = 0.25;
		
		
		var p2 = new Produto();
		p2.preco = 12.56;
		p2.desconto = 0.29;
		p2.nome = "Leite Fresco";
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.println(p1.nome + " " + p2.nome);
		System.out.println(precoFinal1 + "//" + precoFinal2);

	}

}
