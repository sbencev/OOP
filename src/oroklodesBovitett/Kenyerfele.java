package oroklodesBovitett;

public class Kenyerfele extends Pekaru {

	private String tipus;

	public Kenyerfele(String megnevezes, String cikkszam, int ar, int db, boolean teljeskiorlesu, String tipus) {
		super(megnevezes, cikkszam, ar, db, teljeskiorlesu);
		this.tipus = tipus;
	}

	public String toString() {
		return super.toString()+" "+tipus;
	}

	public void tesztAlprogram() {
		System.out.println("Ez a kenyerfele leszarmazott 2. szintu felulirt metodusa");
	}
	
}
