package csvFileBovitve;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fajlkezeles {

	public Tanulo[] fajlBeolvasas(String fajlnev, String elvalaszto) throws IOException {

		Tanulo[] tanulok = new Tanulo[fajlSorainakSzama(fajlnev) - 1];

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"));

		br.readLine(); //fejlecet kulon olvassuk be, mert nem objektumot reprezental

		for (int i = 0; i < tanulok.length; i++) {
			String sor = br.readLine();
			String[] csvSor = sor.split(elvalaszto);

			Tanulo tanuloObj = new Tanulo(csvSor[0], Integer.parseInt(csvSor[1]), Integer.parseInt(csvSor[2]),
					Integer.parseInt(csvSor[3]));

			tanulok[i] = tanuloObj;
		}
		br.close();

		return tanulok;
	}

	private int fajlSorainakSzama(String fajlnev) throws IOException {
		Path utvonal = Paths.get(fajlnev);

		long sorokSzama = Files.lines(utvonal).count();

		return (int) sorokSzama;
	}

}
