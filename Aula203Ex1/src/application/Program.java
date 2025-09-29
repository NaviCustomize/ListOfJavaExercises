package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		// c:\Windows\Temp\in4.txt
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			List<Employee> list = new ArrayList<>();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println("Email of people whose salary is more than 2000.00:");

			List<String> listOfEmail = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted()
					.collect(Collectors.toList());

			listOfEmail.forEach(System.out::println);

			double sum = list.stream().filter(e -> e.getUsername().charAt(0) == 'M').map(e -> e.getSalary()).sorted()
					.reduce(0.0, (a, b) -> a + b);

			System.out.print("Sum of salary of people whose name starts with 'M': " + sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
