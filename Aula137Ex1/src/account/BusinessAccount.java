package account;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//loan = emprestimo
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	
	@Override //sobreposicao
	public void withdraw(double amount) {
		super.withdraw(amount); //o super serve para aproveitar o metodo da super classe Account: pegar o metodo withdraw da classe Account (balance -= amount + 5.0;)
		balance -= 2.0; 
	}
	
}
