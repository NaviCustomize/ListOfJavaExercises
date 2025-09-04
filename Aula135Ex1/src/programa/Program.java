package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employee ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char confirm = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour ");
			double valuePerHour = sc.nextDouble();
			
			if(confirm == 'y') {
				System.out.print("Addicional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourceEmployee(name,hours,valuePerHour,additionalCharge);
				list.add(emp);
			}else {
				Employee emp = new Employee(name,hours,valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println("PAYMENTS:");
		for (Employee l : list) {
			System.out.println(l.getName() + " - $ " + String.format("%.2f", l.payment()));
		}
		sc.close();
	}
	
}
