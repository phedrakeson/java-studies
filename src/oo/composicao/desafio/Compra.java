package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> lista = new ArrayList<>();
	
	Compra(List<Item> itens) {
		this.lista = itens;
	}
	
	Compra() {}
	
	void adicionarItem(Item item) {
		lista.add(item);
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		lista.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: lista) {
			total += item.produto.preco * item.quantidade;
		}
		
		return total;
	}
}
