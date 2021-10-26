package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> lista = new ArrayList<>();
	
	Compra(List<Item> itens) {
		this.lista = itens;
	}
}
