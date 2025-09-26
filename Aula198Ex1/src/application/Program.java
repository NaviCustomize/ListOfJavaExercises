package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		//A funcao map (nao confundir com Map) é uma funcao que aplica uma funcao a todos elementos de uma stream 
		
		/* Conversoes:
		 * 
		 * List para stream: .stream()
		 * stream para List: .collect(Collectors.toList())
		 * */
		
		//map: pega uma colecao de valores e aplica a cada um dos valores da funcao, a funcao que estiver no parenteses
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); 
		
		//List<String> names = list.stream().map(Product::staticToUpperCase).collect(Collectors.toList());
		
		//list.stream().map(Product::nonStaticToUpperCase).collect(Collectors.toList());
		
		/*
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
