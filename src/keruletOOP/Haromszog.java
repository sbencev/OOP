package keruletOOP;

public class Haromszog {

	private double aOldal;
	private double magassag;

	public Haromszog(double aOldal, double magassag) {
		this.aOldal = aOldal;
		this.magassag = magassag;
	}

	public double getAoldal() {
		return aOldal;
	}

	public double getMagassag() {
		return magassag;
	}

	public double teruletSzamitas() {
		return aOldal * magassag / 2;
	}
}
