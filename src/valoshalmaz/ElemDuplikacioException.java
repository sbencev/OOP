package valoshalmaz;

public class ElemDuplikacioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int szam;
	
	public ElemDuplikacioException(int szam,String uzenet) {
		
		super(uzenet);
		this.szam = szam;
		
	}

	public int getSzam() {
		return szam;
	}
	
}
