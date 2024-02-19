package csvFileBovitve;

public class Tanulo {

	private String nev;
	private int matek;
	private int angol;
	private int tortenelem;

	public Tanulo(String nev, int matek, int angol, int tortenelem) {
		this.nev = nev;
		this.matek = matek;
		this.angol = angol;
		this.tortenelem = tortenelem;
	}

	public String getNev() {
		return nev;
	}

	public int getMatek() {
		return matek;
	}

	public int getAngol() {
		return angol;
	}

	public int getTortenelem() {
		return tortenelem;
	}

	@Override
	public String toString() {
		return nev + ": matek=" + matek + ", angol=" + angol + ", tortenelem=" + tortenelem;
	}

	public double atlagSzamitas() {
		return (angol + matek + tortenelem) / 3.0;
	}
	
	public static double osztalyAtlag(Tanulo[] tanulok) {
		double osszeg = 0.0;
		for (int i = 0; i < tanulok.length; i++) {
			osszeg += tanulok[i].atlagSzamitas();
		}

		double atlag = (double) osszeg / tanulok.length;
		
		return atlag;
	}
}
