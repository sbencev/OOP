package absztrakt;

import java.io.IOException;

public class GepalkatreszFoprogram {

	public static void main(String[] args) throws IOException {
		
		GepAlkatresz[] alkatreszek = new GepAlkatresz[2];
		
		alkatreszek[0] = new Processzor("AMD", "R5 3600", 55000, 0.6, "AM4", 3600);
		
		alkatreszek[1] = new Memoria("HyperX", "S002", 18000, 1.5, "DDR4",(byte)16, 3200);
		
		for(GepAlkatresz alkatresz : alkatreszek) {
			//System.out.println(alkatresz.getMegnevezes()+" "+ alkatresz.nemesfemTartalom()+" g/cm2");
			System.out.println(alkatresz.toString()+" "+ alkatresz.nemesfemTartalom()+" g/cm2");
			
		}
		
		FajlKezeles fajl = new FajlKezeles();
		fajl.fajlabaIras("gepalkatreszek.csv", ";", alkatreszek);
		
	}

}
