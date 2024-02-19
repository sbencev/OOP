package osztalyzatokAdatbekeresselEllenorzessel;

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
	
	public Tanulo() {
		
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

	public void setNev(String nev) {
		if (nev != null && !nev.isEmpty()) {
			this.nev = nev;
		} else {
			this.nev = "Hibas adat!";
		}
	}

	public void setMatek(int matek) {
		if (matek >= 1 && matek <= 5) {
			this.matek = matek;
		} else {
			this.matek = 0;
		}
	}

	public void setAngol(int angol) {
		if (angol >= 1 && angol <= 5) {
			this.angol = angol;
		} else {
			this.angol = 0;
		}
	}

	public void setTortenelem(int tortenelem) {
		if (tortenelem >= 1 && tortenelem <= 5) {
			this.tortenelem = tortenelem;
		} else {
			this.tortenelem = 0;
		}
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
