package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		//list.removeIf(new ProductPredicate()); //Interface implementation
		
		// list.removeIf(Product::staticProductPredicate); //method reference with
		// static method
		
		// list.removeIf(Product::nonStaticProductPredicate); //method reference without
		// static method
		
		/*
		 * Predicate<Product> pred = p -> p.getPrice() >= 100; //declared expression
		 * lambda list.removeIf(pred);
		 */
		list.removeIf(p -> p.getPrice() >= 100); // expression lambda inline

		for (Product p : list) {
			System.out.println(p);
		}

		/*
		 * 	No need to read the item above. this was only for me to understand the expression lambda.
		 * 
		 * Pq usar a expressao lambda: Em vez de escrever uma classe inteira e um método
		 * com nome (public class JogaForaVerde implements Predicate...), você só
		 * escreve a regra!
		 * 
		 * banana = objeto da lista
		 *
		 * 
		 * ->: "Agora, veja a regra para essa banana p." (Esta é a flecha mágica que
		 * separa o item da regra).
		 *
		 */

	}

}
