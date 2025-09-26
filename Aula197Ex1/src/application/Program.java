package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));

		//list.forEach(new PriceUpdate()); //Interface implementation
		//list.forEach(Product::staticPriceUpdate); //method reference with static method
		//list.forEach(Product::staticPriceUpdate); //method reference without static method
		
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice()*1.1); //declared expression lambda list.forEach(cons);
		//list.forEach(cons);
		
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //expression lambda inline
		
		list.forEach(System.out::println);
		/*	The "same" code:
		 * 	for(Product p : list) { System.out.println(p); }
		 */
		

	}

}
