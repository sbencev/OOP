package valoshalmaz;

public class sajatHalmaz {

	private byte[] valosHalmaz;
	private byte aktivElemszam;

	public sajatHalmaz() {
		valosHalmaz = new byte[10];
		aktivElemszam = 0;
	}

	/**
	 * Egy halmazt modellezo tomb feltoltese. Elemduplikacio nem engedelyezett.
	 * @param szam, amit be akarunk tolteni a halmazba.
	 * @throws ElemDuplikacioException, {@link MaxElemszamTullepesException} 
	 * 
	 */
	public void tombFeltoltes(byte szam) throws ElemDuplikacioException {
		int i = 0;
		while (i < aktivElemszam && (valosHalmaz[i] != szam)) {
			i++;
		}
		if (i < aktivElemszam) {
			throw new ElemDuplikacioException(szam, "Elem duplikacio!");
		} else if (aktivElemszam < valosHalmaz.length) {
			valosHalmaz[aktivElemszam] = szam;
			aktivElemszam++;
		}else {
			throw new MaxElemTullepesException(szam,"Megtelt a tomb!");
		}
	}

}
