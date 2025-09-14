package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
// c:\\Windows\\Temp\\input.csv
public class Program {
	
	public static void main(String[]args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean sucess = new File(sourceFolderStr + "\\out").mkdir();//mk serve para criar um novo diretorio
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // saida
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name,price, quantity));
				
				itemCsv = br.readLine();
				
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " CREATED");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}
