package absztrakt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FajlKezeles {

	public void fajlabaIras(String fajlnev, String elvalaszto, GepAlkatresz[] alkatreszek)
			throws IOException {

		FileOutputStream fs = new FileOutputStream(fajlnev, false);
		OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");

		for (GepAlkatresz alkatresz : alkatreszek) {

			String kiirasra = alkatresz.getMegnevezes() + elvalaszto + alkatresz.getSzeriaszam() + elvalaszto
					+ alkatresz.getAr() + elvalaszto + alkatresz.getMeret();

			if (alkatresz instanceof Processzor) {

				kiirasra = "Processzor" + elvalaszto + kiirasra + ((Processzor) alkatresz).getTokozas() + elvalaszto
						+ ((Processzor) alkatresz).getOrajel();
			} else if (alkatresz instanceof Memoria) {

				Memoria memObj = (Memoria) alkatresz;

				kiirasra = "Memoria" + elvalaszto + kiirasra + elvalaszto + memObj.getTipus() + elvalaszto
						+ memObj.getKesleltetes() + elvalaszto + memObj.getOrajel();

			}
			
			out.write(kiirasra+"\n");

		}
		out.close();
	}

}
