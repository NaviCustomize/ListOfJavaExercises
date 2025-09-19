package model.services;

public interface TaxService {
	
	//interface é um tipo que define um conjunto de operação que uma classe deve implementar
	//A interface estabelece um contrato que a classe deve cumprir
	//Pra que? para criar sistemas de baixo acoplamento e flexivel
	
	double tax(double amount);
	
}
