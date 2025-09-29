package entities;

public class Program {
	
	public static void main(String[]args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test"; //Tratamento especia para literais
		String s2 = "Test"; //true
		
		String s3 = "Test";				//Forca a cricacao de um novo objeto de forma comum
		String s4 = new String("Test"); //false
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2)); // <- Comparar conteudo dos objetos
		System.out.println(c1 == c2);  	// <- Comparar a referencia dos objetos
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}
	
}
