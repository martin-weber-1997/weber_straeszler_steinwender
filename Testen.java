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
	public static void main(String[] args) {
		/*
		 * Test von Zahlen
		 */
		Zahlen test2 = new Zahlen(2.0);
		test2.add(1.0);
		System.out.println("Testen der Zahlen Klasse: ");

		
		System.out.println("Das Maximum der Zahlen: " + test2.max());
		System.out.println("Das Mimimum der Zahlen: " + test2.min());
		System.out.println("Die Summe der Zahlen: " + test2.summe());

		/*
		 * Test von Rauminhalt
		 */
		System.out.println("Testem der Rauminhalt Klasse: ");
		System.out
				.println("Volumen eines Kegels mit Grundflaeche=20 und Hoehe=5 Gegeben: "
						+ Rauminhalt.coneGH(20, 5));
		System.out
				.println("Volumen eines Kegels mit Radius=10 und Hoehe=5 gegeben "
						+ Rauminhalt.conePIrh(10, 5));
		System.out.println("Volumen eines Quaders mit a=2 b=2 und h=4 gegeben "
				+ Rauminhalt.cuboid(2, 2, 4));
		System.out
				.println("Volumen einer Pyramide mit der Grundflaeche=10 und Hoehe=5: "
						+ Rauminhalt.pyramid(10, 5));

		/*
		 * testung der klasse flaechen
		 */
		System.out.println("Testen der Flaechen Klasse: ");
		Flaechen f1 = new Flaechen();
		System.out.println("Die Flaeche eines Rechtecks mit a=5 und b=9: "
				+ f1.flaecheR(5, 9));
		System.out.println("Die Flache eines Kreises mit r=4: "
				+ f1.flaecheK(4));
		System.out.println("Die Flaeche eines Dreiecks mit a=2 b=5 und c=4: "
				+ f1.flaecheD(2, 5, 4));
	}
}
