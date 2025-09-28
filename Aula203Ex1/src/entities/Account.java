package entities;

public class Account {
	
	private String usename;
	private String email;
	private Double price;
	
	public Account(String usename, String email, Double price) {
		this.usename = usename;
		this.email = email;
		this.price = price;
	}

	public String getUsename() {
		return usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Account [usename=" + usename + ", email=" + email + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
