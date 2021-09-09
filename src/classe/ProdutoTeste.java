package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Paçoca";
		p1.preco = 14.32;
		p1.desconto = 0.25;
		
		
		var p2 = new Produto();
		p2.preco = 12.56;
		p2.desconto = 0.29;
		p2.nome = "Leite Fresco";
		
		System.out.println(p1.nome + " " + p2.nome);

	}

}
