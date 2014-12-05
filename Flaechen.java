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
	 * gleichseitiges dreieck
	 * @param a eine seite
	 * @return flaeche
	 */
	public double flaecheD(int a){
		double e = ((a*a)/4)*Math.sqrt(3);
		return e;
	}
	
	/**
	 * gleichschenkeliges und allgemeines Dreieck
	 * @param a eine seite
	 * @param h	die dazugehoerige hoehe
	 * @return flaeche
	 */
	public double flaecheD(int a, int h){
		double e = (1/2) * a * h;
		return e;
	}
	
	/**
	 * rechtwinkeliges Dreieck
	 * @param a seite a
	 * @param b seite b
	 * @return flaeche
	 */
	public double flaecheDRecht(int a, int b){
		double e = (1/2) * a * b;
		return e;
	}
}
