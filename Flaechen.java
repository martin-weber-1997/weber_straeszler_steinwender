package weber_straeszler_steinwender;

/**
 * Klasse zum berechnen der flaeche von Dreiecken, Kreis und Rechtecken
 * @author Jan-Philipp
 * @version 05.12.2014
 */
public class Flaechen {

	/**
	 * rechteck
	 * @param a seite a
	 * @param b seite b
	 * @return flaeche
	 */
	public double flaecheR(int a, int b) {
		return a*b;
	}
	
	/**
	 * kreis
	 * @param r radius
	 * @return flaeche
	 */
	public double flaecheK(int r) {
		double a = Math.PI * r * r;
		return a;
	}
	
	/**
	 * dreieck
	 * @param a seite a
	 * @param b seite b
	 * @param c seite c
	 * @return flaeche
	 */
	public double flaecheD(int a, int b, int c){
		double s = (a + b + c)/2;
		double e = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return e;
	}
	
}
