package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[]args) {
		
		
		// Map<K(Key), V(Value)>
		Map<String, String> cookie = new TreeMap<>();
		
		cookie.put("username", "Maria");
		cookie.put("email", "maria@gmail.com");
		cookie.put("phone", "709173097");
		
		cookie.remove("email");
		cookie.put("phone", "1203912");
		
		System.out.println("Contain 'phone' key: " + cookie.containsKey("phone"));
		System.out.println("Phone number: "+ cookie.get("phone"));
		System.out.println("Email: " + cookie.get("email"));
		System.out.println("Size: " + cookie.size());
		
		System.out.println("All cookie");
		
		for (String key : cookie.keySet()) {
			System.out.println(key + ": " + cookie.get(key));
		}
		
	}
	
}
