package kivetelKezeles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FoprogramKivetelkezeles {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int elso = 0, masodik = 0, harmadik = 0;

		boolean joErtek = false;
		do {
			try {

				System.out.println("Adja meg az elso szamot: ");
				elso = Integer.parseInt(br.readLine());

				System.out.println("Adja meg a masodik szamot: ");
				masodik = Integer.parseInt(br.readLine());

				System.out.println("Adja meg a harmadik szamot: ");
				harmadik = Integer.parseInt(br.readLine());

				joErtek = true;

			} catch (NumberFormatException e) {

				System.out.println("Nem megfelelo formatum vagy ertektartomany!" + e.getMessage());
				e.printStackTrace();

			} catch (IOException kivetel) {

				System.out.println("I/O hiba!"); // detailedMessage adattag gettere az eredeti
													// uzenettel

			}

		} while (!joErtek);

		try {
			int[] tomb = new int[elso * masodik * harmadik];
			System.out.println(tomb.length);

			// System.out.println(tomb[tomb.length]);

			System.out.println((elso + masodik + harmadik) / Math.min(elso, Math.min(masodik, harmadik)));

		} catch (NegativeArraySizeException e) {
			System.out.println("Negativ elemszama nem lehet a tombnek!");
		} catch (OutOfMemoryError e) {
			System.out.println("Tul nagy elemszam, nem fer be a memoriaba!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nem letezo indexre tortent hivatkozas!");
		} catch (ArithmeticException e) {
			System.out.println("Nullaval osztas nem lehetseges!");
		}

		// String szoveg = null;
		String fajlnev = null;

		System.out.println("Adja meg a fajl nevet: ");
		try {
			fajlnev = br.readLine();
		} catch (UnsupportedEncodingException e) {
			System.out.println("Karakterkodolasi hiba!");
		} catch (FileNotFoundException e) {
			System.out.println("Nem talalhato a fajl!");
		} catch (IOException e) {
			System.out.println("I/O hiba!");
		}

		try {
			System.out.println(fajlnev.charAt(0));
			// System.out.println(szoveg.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("Nincs erteke a valtozonak!");
		}

	}
}
