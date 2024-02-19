package oroklodes;

public class abcOroklodes {

	public static void main(String[] args) {
		
		Termek altalanosObj = new Termek("kristalycukor","c01",490,50);
		Tejtermek tejObj = new Tejtermek("tejfol","c02",550,28,20.0f);
		Pekaru pekObj = new Pekaru("kifli","c03",59,70,false);
		
		System.out.println(altalanosObj.toString());
		altalanosObj.tesztAlprogram();
		
		System.out.println(tejObj.toString());
		tejObj.tesztAlprogram();
		
		System.out.println(pekObj.toString());
		pekObj.tesztAlprogram();
		
		Kenyerfele kenyerObj = new Kenyerfele("szeletelt kenyer","c04",530,10,false,"feher");
		
		System.out.println(kenyerObj.toString());
		kenyerObj.tesztAlprogram();

	}

}
