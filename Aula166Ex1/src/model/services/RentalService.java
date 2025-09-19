package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double PricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		PricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basciPayment;
		if(hours <= 12) {
			basciPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basciPayment = PricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basciPayment);	
		
		carRental.setInvoice(new Invoice(basciPayment,tax));
	}
	
	
	
}
