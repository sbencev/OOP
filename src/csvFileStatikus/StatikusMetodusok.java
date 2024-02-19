package csvFileStatikus;

public class StatikusMetodusok {
	public static double osztalyAtlag(Tanulo[] tanulok) {
		
		double osszeg = 0.0;
		for (int i = 0; i < tanulok.length; i++) {
			osszeg += tanulok[i].atlagSzamitas();
		}

		double atlag = (double) osszeg / tanulok.length;

		return atlag;
		
	}
	private StatikusMetodusok() {
		
	}
}
