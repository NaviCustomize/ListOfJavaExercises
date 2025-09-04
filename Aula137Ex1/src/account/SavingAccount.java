package account;

public class SavingAccount extends Account{
	
	private Double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updadeBalance(){
		balance += balance * interestRate;
	}
	@Override //sobreposicao
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
	
}
