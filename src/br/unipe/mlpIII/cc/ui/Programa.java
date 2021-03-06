package br.unipe.mlpIII.cc.ui;

import br.unipe.mlpIII.cc.modelo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
	public static void main(String args[]){
		
		Item item1 = new Item(7, "Item1", 700.00);
		Item item2 = new Item(12, "Item2", 1200.00);
		Item item3 = new Item(1, "Item3", 100.00);
		Item item4 = new Item(4, "Item4", 400.00);
		
		List<Item> listaDeItens = new ArrayList<Item>();
		
		listaDeItens.add(item1);
		listaDeItens.add(item2);
		listaDeItens.add(item3);
		listaDeItens.add(item4);
		
		Collections.sort(listaDeItens);
		
		System.out.println("Ordena��o crescente: " + listaDeItens);
		
		Collections.reverse(listaDeItens);
		
		System.out.println("Ordena��o decrescente: " + listaDeItens);
	}
}
