package laptop;

public class FoProgram {

	public static void main(String[] args) {
		
		Laptop laptopObj = new Laptop();
		
		Laptop laptopObj2 = new Laptop("Gyarto","Tipus","C001");
		
		Laptop laptopObj3 = new Laptop("HP","Pavilon","C002",400000);

		System.out.println(laptopObj2.getAr());
		
		System.out.println(laptopObj2.getCikkszam());
		
		System.out.println(laptopObj2.getGyarto());
		
		System.out.println(laptopObj2.getTipus());
		
		laptopObj2.setAr(250000);
		
		System.out.println(laptopObj2.getAr());
		
		System.out.println(laptopObj.mindenAdat());
		
		System.out.println(laptopObj3.mindenAdat());
	}

}
