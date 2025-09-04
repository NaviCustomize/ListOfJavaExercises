package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisico;
import entities.Juridico;

public class Program {

	public static void main(String[]args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		List<Contribuinte>list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println("Rax payer #"+i+ " data:");
			
			System.out.println("Individual of company (i/c)?");
			char escolha = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Atual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if(escolha == 'i') {
				System.out.println("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				Contribuinte cont = new Fisico(nome, rendaAnual, gastosSaude);
				list.add(cont);
		
			}
			else if(escolha == 'c') {
				System.out.print("Number fo employees: ");
				int numFuncionario = sc.nextInt();
				Contribuinte cont = new Juridico(nome, rendaAnual, numFuncionario);
				list.add(cont);
			}else {
				System.out.println("Erro");
			}
		}
		
		double sum = 0.0;
		System.out.println("TAXES PAID: ");
		for (Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getNome() + " - $" + String.format("%.2f", contribuinte.calcImposto()));
			sum+=contribuinte.calcImposto();
		}
		
		System.out.print("Total taxes: $" + String.format("%.2f", sum));
		
	
		sc.close();
	}
	
}
