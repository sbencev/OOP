package oroklodes;

public class Pekaru extends Termek {

	private boolean teljeskiorlesu;

	public Pekaru(String megnevezes, String cikkszam, int ar, int db, boolean teljeskiorlesu) {
		super(megnevezes, cikkszam, ar, db);
		this.teljeskiorlesu = teljeskiorlesu;
	}

	public String toString() {

		return "Termek megnevezese: " + getMegnevezes() + "cikkszama: " + getCikkszam() + " ara: " + getAr() + " Ft "
				+ getDb() + " db" + ((teljeskiorlesu) ? " teljeskiorlesu" : " nem teljeskiorlesu");
	}

	public void tesztAlprogram() {

		System.out.println("Ez a pekaru leszarmazott felulirt metodusa");
	}

}
