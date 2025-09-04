package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape>list = new ArrayList<>();
		
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)?");
			char escolha = sc.next().charAt(0);
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(escolha == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				Rectangle rec = new Rectangle(color, width, height);
				list.add(rec);
			}
			else if(escolha == 'c') {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				Circle cir = new Circle(color, radius);
				list.add(cir);
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		
		for (Shape shape : list) {
			System.out.print(String.format("%.2f%n", shape.area()));
		}
		
		
		
		sc.close();
		
	}
	
}
