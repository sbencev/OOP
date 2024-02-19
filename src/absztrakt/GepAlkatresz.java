package absztrakt;

public abstract class GepAlkatresz {

	private String megnevezes;
	private String szeriaszam;
	private int ar;
	private double meret;

	public GepAlkatresz(String megnevezes, String szeriaszam, int ar, double meret) {
		this.megnevezes = megnevezes;
		this.szeriaszam = szeriaszam;
		this.ar = ar;
		this.meret = meret;
	}

	public double getMeret() {
		return meret;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public String getSzeriaszam() {
		return szeriaszam;
	}

	public int getAr() {
		return ar;
	}

	@Override
	public String toString() {
		return megnevezes + " " + szeriaszam + " " + ar + " Ft" + " " + meret;
	}

	public abstract double nemesfemTartalom();

}
