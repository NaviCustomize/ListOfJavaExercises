package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Account;

public class Program {
	//c:\Windows\Temp\in4.txt
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Account> list = new ArrayList<>();
			String line = br.readLine();
			
			while(line!=null) {
				
				String[] fields = line.split(",");
				
				list.add(new Account(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
				List<String> emails = list.stream()
						.filter(a -> a.getPrice() > salary)
						.map(a -> a.getEmail())
						.sorted()
						.collect(Collectors.toList());
				
				System.out.println("email of people whose salary is more than " + String.format("%.2f", salary));
				emails.forEach(System.out::println);

				
				double sum = list.stream()
						.filter(a -> a.getUsename().charAt(0)=='M')
						.map(a -> a.getPrice())
						.reduce(0.0,(a , b) -> a + b);
				
				System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
						
				
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
	
}
