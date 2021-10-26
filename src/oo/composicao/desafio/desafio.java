package oo.composicao.desafio;

import java.util.ArrayList;

public class desafio {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Carlitos");
		ArrayList<Item> lista1 = new ArrayList<>();
		ArrayList<Item> lista2 = new ArrayList<>();
		
		lista1.add( new Item(new Produto("Pão", 2.59), 2));
		lista1.add( new Item(new Produto("Paçoca", 1.50), 10));
		
		lista2.add( new Item(new Produto("PC Gamer", 100000), 1));
		lista2.add( new Item(new Produto("Gol Quadrado", 8000), 1));
		
		Compra compra_1 = new Compra(lista1);
		Compra compra_2 = new Compra(lista2);
		
		c1.adicionarCompra(compra_1);
		c1.adicionarCompra(compra_2);
		
		double valorTotalCompras = c1.obterValorTotal();
		System.out.println("O valor total das compra foi de: " + valorTotalCompras);
	}

}
