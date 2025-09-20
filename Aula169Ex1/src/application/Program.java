package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato de parcelas: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.println("Entre com o numero de parcelas");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		for(Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
