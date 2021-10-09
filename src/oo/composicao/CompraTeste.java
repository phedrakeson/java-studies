package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João";
		c1.itens.add(new Item("borracha", 1, 20.9));
		c1.adicionarItem(new Item("pão", 10, 1.9));
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		// Só pra brincar com a relação bidirecional
		double total = c1
				.itens.get(0)
				.compra
				.itens.get(1)
				.compra.
				obterValorTotal();
		System.out.println(total);
	}

}
