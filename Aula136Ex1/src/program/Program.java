package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import productPackage.ImportedProduct;
import productPackage.Product;
import productPackage.UsedProduct;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Product #" + i + " data: ");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char confirm = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(confirm == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				Product pro = new ImportedProduct(name, price,customFee);
				list.add(pro);
			}
			else if(confirm == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				Product pro = new Product(name, price);
				list.add(pro);
			}
			
		}
		
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
	
}
