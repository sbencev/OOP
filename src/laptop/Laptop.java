package laptop;

public class Laptop {

	// I. egyseg: valtozok / adattag / field / mezo

	private String gyarto;
	private String tipus;
	private String cikkszam;
	private int ar;

	// II. egyseg: konstruktor

	// 1. pelda: ar kivetelevel az adatokat a peldanyt letrehozo adja meg, ar legyen
	// fix 300000;

	public Laptop(String gyar, String tip, String cikk) {

		gyarto = gyar;
		tipus = tip;
		cikkszam = cikk;
		ar = 300000;
	}

	// 2. pelda: minden adat atadasra kerul peldanyositaskor

	public Laptop(String gyarto, String tipus, String cikkszam, int ar) {

		this.gyarto = gyarto;
		this.tipus = tipus;
		this.cikkszam = cikkszam;
		this.ar = ar;

	}

	// 3. pelda: objektum letrehozasa nelkul, kesobbi ertekadassal

	public Laptop() {

	}

	// III.egyseg: getter/setter

	public int getAr() {
		return ar;
	}

	public String getCikkszam() {
		return cikkszam;
	}

	public String getGyarto() {
		return gyarto;
	}

	public String getTipus() {
		return tipus;
	}
	
	public void setAr(int ar) {
		this.ar = ar;
	}
	
	//IV. metodusok:
	
	public String mindenAdat() { // = toString() metodus
		
		return gyarto+" "+tipus+" "+ar;
	}
}
