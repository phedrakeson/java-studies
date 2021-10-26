package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> lista = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.lista.add(compra);
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Compra compra: lista) {
			for(Item item: compra.lista) {
				valorTotal += item.produto.preco * item.quantidade;
			}
		}
		
		return valorTotal;
	}
}
