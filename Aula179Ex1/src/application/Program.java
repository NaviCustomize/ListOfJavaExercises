package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		 // ps.addValue("Maria"); 
		 // gracas ao generics, podemos permitir 
		 //que classes, interfawces e metodos possam
		 //ser parametrizados por tipo. Tens beneficios como:
			/*
			 * Reuso
			 * Type Safety
			 * Performance
			 */
		
		for(int i = 0;i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		 /* Integer x = (Integer) ps.first(); Nao precisa fazer mais o casting */
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
	
}
