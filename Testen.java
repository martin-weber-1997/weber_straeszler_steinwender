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
		Zahlen test2=new Zahlen(2.0);
		test2.add(1.0);
		System.out.println("Das Maximum der Zahlen: "+test2.max());
		System.out.println("Das Mimimum der Zahlen: "+test2.min());
		System.out.println("Die Summe der Zahlen: "+test2.summe());
		
		Rauminhalt test1= new Rauminhalt();
		
	}
}
