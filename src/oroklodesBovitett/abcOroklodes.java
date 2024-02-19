package oroklodesBovitett;

import java.util.Scanner;

public class abcOroklodes {

	public static void main(String[] args) {
		/*
		 * Termek altalanosObj = new Termek("kristalycukor", "c01", 490, 50); Tejtermek
		 * tejObj = new Tejtermek("tejfol", "c02", 550, 28, 20.0f); Pekaru pekObj = new
		 * Pekaru("kifli", "c03", 59, 70, false);
		 * 
		 * System.out.println(altalanosObj.toString()); altalanosObj.tesztAlprogram();
		 * 
		 * System.out.println(tejObj.toString()); tejObj.tesztAlprogram();
		 * 
		 * System.out.println(pekObj.toString()); pekObj.tesztAlprogram();
		 * 
		 * Kenyerfele kenyerObj = new Kenyerfele("szeletelt kenyer", "c04", 530, 10,
		 * false, "feher");
		 * 
		 * System.out.println(kenyerObj.toString()); kenyerObj.tesztAlprogram();
		 */

		Termek obj1 = new Pekaru("kuglof", "c10", 750, 12, false);
		Termek obj2 = new Termek("liszt", "c11", 550, 55);
		Termek obj3 = new Tejtermek("kakao", "c12", 390, 32, 2.8f);

		Termek[] termekek = new Termek[6];

		termekek[0] = obj1;
		termekek[1] = obj2;
		termekek[2] = obj3;

		termekek[3] = new Pekaru("zsomle", "c13", 49, 80, true);
		termekek[4] = new Termek("kenomajas", "c14", 370, 35);
		termekek[5] = new Kenyerfele("cipo", "c15", 640, 8, false, "rozs");

		System.out.println("1. pelda: osszes termek kilistazasa");
		for (Termek termek : termekek) {
			System.out.println(termek.toString());
			termek.keszletEllenorzes();
		}

		System.out.println("2. pelda: pekaru kiiratasa");
		for (Termek termek : termekek) {
			if (termek instanceof Pekaru && !(termek instanceof Kenyerfele)) {
				System.out.println(termek.toString());

			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a a cikkszamot: ");
		String cikkszam = sc.nextLine();

		int i = 0;
		while (i < termekek.length && !cikkszam.equals(termekek[i].getCikkszam())) {
			i++;
		}
		if (i < termekek.length) {
			System.out.println(termekek[i].toString());
		} else {
			System.out.println("Nem talalhato termek a cikkszam alapjan");
		}

		sc.close();

		// objektum tipusanak megallapitasa:
		// instanceof isInstance() getClass()

		if (termekek[0] instanceof Termek) {
			System.out.println("Az objektum egy Termek");
		} else {
			System.out.println("Az objektum nem egy Termek");
		}
		if (termekek[0] instanceof Pekaru) {
			System.out.println("Az objektum egy Pekaru");
		} else {
			System.out.println("Az objektum nem Pekaru");
		}
		if (termekek[0] instanceof Kenyerfele) {
			System.out.println("Az objektum egy Kenyerfele");
		} else {
			System.out.println("Az objektum nem Kenyerfele");
		}
		if (termekek[0] instanceof Tejtermek) {
			System.out.println("Az objektum egy Tejtermek");
		} else {
			System.out.println("Az objektum nem Tejtermek");
		}

		if (Termek.class.isInstance(termekek[0])) {
			System.out.println("Az objektum egy Termek");
		} else {
			System.out.println("Az objektum nem egy Termek");
		}
		if (Pekaru.class.isInstance(termekek[0])) {
			System.out.println("Az objektum egy Pekaru");
		} else {
			System.out.println("Az objektum nem egy Pekaru");
		}
		if (Kenyerfele.class.isInstance(termekek[0])) {
			System.out.println("Az objektum egy Kenyerfele");
		} else {
			System.out.println("Az objektum nem egy Kenyerfele");
		}
		if (Tejtermek.class.isInstance(termekek[0])) {
			System.out.println("Az objektum egy Tejtermek");
		} else {
			System.out.println("Az objektum nem egy Tejtermek");
		}

		if (termekek[0].getClass() == Termek.class) {
			System.out.println("Az objektum egy Termek");
		} else {
			System.out.println("Az objektum nem egy Termek");
		}
		if (termekek[0].getClass() == Pekaru.class) {
			System.out.println("Az objektum egy Pekaru");
		} else {
			System.out.println("Az objektum nem egy Pekaru");
		}
		if (termekek[0].getClass() == Kenyerfele.class) {
			System.out.println("Az objektum egy Kenyerfele");
		} else {
			System.out.println("Az objektum nem egy Kenyerfele");
		}
		if (termekek[0].getClass() == Tejtermek.class) {
			System.out.println("Az objektum egy Tejtermek");
		} else {
			System.out.println("Az objektum nem egy Tejtermek");
		}

	}

}
