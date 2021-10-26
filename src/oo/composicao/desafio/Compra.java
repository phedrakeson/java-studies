package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> lista = new ArrayList<>();
	
	Compra(List<Item> itens) {
		this.lista = itens;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: lista) {
			total += item.produto.preco * item.quantidade;
		}
		
		return total;
	}
}
