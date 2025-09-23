package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		// c:\Windows\Temp\in2.txt

		System.out.println("Enter documents path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> mapVotes = new TreeMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] filds = line.split(",");
				String username = filds[0];
				Integer number = Integer.parseInt(filds[1]);

				if (mapVotes.containsKey(username)) {
					int voteSoFar = mapVotes.get(username);
					mapVotes.put(username, number + voteSoFar);
				} else {
					mapVotes.put(username, number);
				}
				line = br.readLine();
			}

			for (String key : mapVotes.keySet()) {
				System.out.println(key + ": " + mapVotes.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
