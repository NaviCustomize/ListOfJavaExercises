package model.entities;

public class Employee {

	private String username;
	private String email;
	private Double salary;

	public Employee(String username, String email, Double salary) {
		this.username = username;
		this.email = email;
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", email=" + email + ", salary=" + salary + "]";
	}

}
