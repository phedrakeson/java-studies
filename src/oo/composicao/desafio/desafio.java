package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class desafio {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Carlitos");
		List<Item> lista2 = new ArrayList<>();
		
		lista2.add( new Item(new Produto("PC Gamer", 100000), 1));
		lista2.add( new Item(new Produto("Gol Quadrado", 8000), 1));
		
		Compra compra_1 = new Compra();
		Compra compra_2 = new Compra(lista2);
		
		compra_1.adicionarItem(new Item(new Produto("Pão", 2.59), 2));
		compra_1.adicionarItem("Paçoca", 1.50, 10);
		
		c1.adicionarCompra(compra_1);
		c1.adicionarCompra(compra_2);
		
		double valorTotalCompras = c1.obterValorTotal();
		System.out.println("O valor total das compra foi de: " + valorTotalCompras);
	}

}
