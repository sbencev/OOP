package keruletOOP;

public class TeruletSzamit {

	public static void main(String[] args) {
		System.out.println("A terulet: " + teruletSzamitas(7));
		System.out.println("A terulet: " + teruletSzamitas(3, 8));

		Kor korObj = new Kor(7.5);

		System.out.printf("A terulet: %.2f%n", teruletSzamitas(korObj));

		Haromszog haromszog = new Haromszog(4, 3);

		System.out.printf("A terulet: %.2f", haromszog.teruletSzamitas());
	}

	public static double teruletSzamitas(Kor kor) {
		return kor.getSugar() * kor.getSugar() * Math.PI;

	}

	public static double teruletSzamitas(Haromszog haromszog) {
		return haromszog.getAoldal() * haromszog.getMagassag() / 2;
	}

	public static double teruletSzamitas(double negyzetOldala) {

		return negyzetOldala * negyzetOldala;

	}

	public static double teruletSzamitas(double teglalapAoldal, double teglalapBoldal) {

		return teglalapAoldal * teglalapBoldal;

	}

}
