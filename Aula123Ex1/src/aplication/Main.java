package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.WorkerLevel;
import pacote.Department;
import pacote.HourContract;
import pacote.Worker;

public class Main {
	
	public static void main(String[]args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary:");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How manu contracts to this worker?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Date (DD/MM/YYYY:)");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours)");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		System.out.println("Enter mouth and year to calculate income (MM/YYYY): ");
		String mouthAndYear = sc.next();
		
		int mouth = Integer.parseInt(mouthAndYear.substring(0, 2));
		int year = Integer.parseInt(mouthAndYear.substring(3));
		System.out.println("Name " + worker.getName());
		System.out.println("Department " + worker.getDepartment().getName());
		System.out.println("Income for " + mouthAndYear + ": " + String.format("%.2f",worker.income(year, mouth)));
		
		sc.close();
	}
	
}
