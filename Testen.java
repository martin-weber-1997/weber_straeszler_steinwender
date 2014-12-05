package weber_straeszler_steinwender;

/**
 * Klasse in der die Funktionen der anderen Klassen getestet werden
 * 
 * @author Martin
 * @version 1.0
 */
public class Testen {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[]args){
		
		Rauminhalt test1= new Rauminhalt();
		
		/*
		 * testung der klasse flaechen
		 */
		Flaechen f1 = new Flaechen();
		System.out.println(f1.flaecheR(5, 9));
		System.out.println(f1.flaecheK(4));
		System.out.println(f1.flaecheD(2, 5, 4));
	}
}
