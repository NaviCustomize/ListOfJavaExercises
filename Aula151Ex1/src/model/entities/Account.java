package model.entities;

import model.exception.DomainException;

public class Account {
	
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount){
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(balance < amount) {
			throw new DomainException("Not enough balance");
		}
		else {
			balance -= amount;
		}
		
	}
}
