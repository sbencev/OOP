package osztalyzatokAdatbekeresselEllenorzessel;

import java.util.Scanner;

public class Adatkezeles {

	public Tanulo adatokKonzolrol() {
		Scanner sc = new Scanner(System.in);

		String nev;
		int matek, angol, tortenelem;
		
		System.out.println("Kerem a tanulo nevet: ");
		nev = sc.nextLine();
		
		System.out.println("Kerem "+nev+" matek osztalyzatat: ");
		matek = Integer.parseInt(sc.nextLine());
		
		System.out.println("Kerem "+nev+" angol osztalyzatat: ");
		angol = Integer.parseInt(sc.nextLine());
		
		System.out.println("Kerem "+nev+" tortenelem osztalyzatat: ");
		tortenelem = Integer.parseInt(sc.nextLine());
		
		Tanulo ujtanulo = new Tanulo();
		ujtanulo.setNev(nev);
		ujtanulo.setMatek(matek);
		ujtanulo.setAngol(angol);
		ujtanulo.setTortenelem(tortenelem);
		
		sc.close();
		
		return ujtanulo;
				
	}

}
