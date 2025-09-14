package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[]args) {
		
		String[] lines = new String[] {
				"Good morning",
				"Good afternoon",
				"Good night"
		};
		
		String path = "c:\\Windows\\Temp\\out.txt";
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //true serve para nao recriar o arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
