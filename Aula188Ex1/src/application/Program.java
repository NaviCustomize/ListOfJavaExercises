package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students on course A?");
		int nA = sc.nextInt();
		for (int i = 1; i <= nA; i++) {
			a.add(sc.nextInt());
		}

		System.out.print("How many students on course B?");
		int nB = sc.nextInt();
		for (int i = 1; i <= nB; i++) {
			b.add(sc.nextInt());

		}
		System.out.print("How many students on course C?");
		int nC = sc.nextInt(); 
		for (int i = 1; i <= nC; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer>totalStudents = new HashSet<>(a);
		totalStudents.addAll(b);
		totalStudents.addAll(c);
		
		System.out.println("Total students: " + totalStudents.size());
	}

}
