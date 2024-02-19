package oroklodes;

public class Tejtermek extends Termek {

	private float zsirtartalom;

	public Tejtermek(String megnevezes, String cikkszam, int ar, int db, float zsirtartalom) {

		super(megnevezes, cikkszam, ar, db);
		this.zsirtartalom = zsirtartalom;

	}

	public String toString() {
		return super.toString() + " " + zsirtartalom;
	}

	public void tesztAlprogram() {

		System.out.println("Ez a tejtermek leszarmazott felulirt metodusa");
	}

}
