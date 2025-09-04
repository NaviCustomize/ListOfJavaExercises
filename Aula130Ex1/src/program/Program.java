package program;

import account.Account;
import account.BusinessAccount;
import account.SavingAccount;

public class Program {
	
	public static void main(String[]args) {
		
		/*
		Account acc = new Account(1001,"alex",0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
		
		// UPCASTING
		// conversão implícita de uma instância de uma subclasse (classe filha)
		// para uma referência de sua superclasse (classe pai), permitindo que 
		// você trate um objeto especializado como um objeto mais genérico.
		
		Account acc1 = bacc; //A conta empresarial tmb é uma conta
		Account acc2 = new BusinessAccount(1003,"bob", 0.0, 600.0);
		Account acc3 = new SavingAccount(1004,"ana", 0.0, 0.01);	
		
		//É possivel pegar um objeto que 
		//é de alguma subclasse e atribuilo
		//a uma variavel da super classe
		
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		//O BusinessAccount é uma Account
		
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;  
		//O acc3(SavingAccount) nao é um businessAccount, 
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			// ira negar, pois acc3 nao é um SavingAccount
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updadeBalance();
			System.out.println("Update!");
			// ira confirmar, pois acc3 é um SavingAccount
		}
		
		
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		SavingAccount sacc1 = new SavingAccount(1002, "Junia", 1000.0, 0.01);
		sacc1.withdraw(200.0);
		System.out.println(sacc1.getBalance());
		
		BusinessAccount bacc1 = new BusinessAccount(1003, "Gabi", 1000.0, 200.0);
		bacc1.withdraw(200.0);
		System.out.println(bacc1.getBalance());
		
		*/
		
		Account x = new Account(1020, "Joao", 1000.0);
		Account y = new SavingAccount(1023,"Jenni",1000.0,0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
	
}
