package valoshalmaz;

public class MaxElemTullepesException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int szam;

	public MaxElemTullepesException(int szam, String uzenet) {
		
		super(uzenet);
		this.szam = szam;
	}

	public int getSzam() {
		return szam;
	}
	
	
}
