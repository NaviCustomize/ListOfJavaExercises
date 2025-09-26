package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{
	
	//Functional Interfaces
	
	@Override
	public boolean test(Product p) {
		
		return p.getPrice() >= 100;
	}

}
