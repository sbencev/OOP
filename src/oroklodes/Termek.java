package oroklodes;

public class Termek {

	private String megnevezes;
	private String cikkszam;
	private int ar;
	private int db;
	
	
	public Termek(String megnevezes, String cikkszam, int ar, int db) {
		this.megnevezes = megnevezes;
		this.cikkszam = cikkszam;
		this.ar = ar;
		this.db = db;
	}


	public String getMegnevezes() {
		return megnevezes;
	}


	public String getCikkszam() {
		return cikkszam;
	}


	public int getAr() {
		return ar;
	}


	public int getDb() {
		return db;
	}


	@Override
	public String toString() {
		return "Termek megnevezese: " + megnevezes + ", cikkszama: " + cikkszam + ", ara: " + ar+ "Ft, " + db +"db";
	}
	
	public void tesztAlprogram() {
		System.out.println("Ez az ososztaly metodusa");
	}
	
}
