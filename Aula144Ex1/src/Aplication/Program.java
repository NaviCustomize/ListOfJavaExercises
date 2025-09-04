package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		
		method1();
		
		
		System.out.println("End");
		
		
	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	
	public static void method2(){
		
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try { //contem o codigo da execucao normal 
			  //que pode acarretar em uma excecao
			  //(Tenta fazer o codigo)
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				//contem o codigo a ser executado caso
				//ocorra uma exceção
				//(tenta esse codigo se o try nao funcionar)
				
				System.out.println("Invalid position");
				e.printStackTrace();
				sc.next();
			}
			catch(InputMismatchException  e) {
				System.out.println("Invalid input");
			}
			finally { //codigo que é executado mesmo tendo  
					  //ou nao ocorrido a excecao
				
			}
			sc.close();
			System.out.println("***METHOD2 END***");
	}
	
}
