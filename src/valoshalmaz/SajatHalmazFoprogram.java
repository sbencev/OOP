package valoshalmaz;

public class SajatHalmazFoprogram {

	public static void main(String[] args) {

		sajatHalmaz halmaz = new sajatHalmaz();

		try {
			halmaz.tombFeltoltes((byte) 44);
			halmaz.tombFeltoltes((byte) 29);
			halmaz.tombFeltoltes((byte) 58);
			halmaz.tombFeltoltes((byte) 28);
		} catch (ElemDuplikacioException e) {
			System.err.println(
					e.getMessage() + " A szam, ami duplikacio miatt nem toltheto be a halmazba: " + e.getSzam());
		}catch(MaxElemTullepesException e) {
			System.err.println(e.getMessage()+" A szam ami mar nem fer be a tombbe: "+e.getSzam());
		}

	}

}
