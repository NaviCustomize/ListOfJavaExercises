package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter account data: ");
			
			
			System.out.print("number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double inicialBalance = sc.nextDouble() //500
;
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble(); //300
			
			Account acc1 = new Account(number, holder, inicialBalance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: "); //100
			Double amount = sc.nextDouble();
			
			acc1.withdraw(amount);
			
			System.out.println("New balance: $ " + String.format("%.2f", acc1.getBalance()) );
			
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Wrong input");
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected Error");
		}
		
		
		
		
		sc.close();
		
	}
	
}
