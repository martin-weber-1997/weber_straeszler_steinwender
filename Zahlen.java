package weber_straeszler_steinwender;

import java.util.Collections;
import java.util.HashSet;

/**
 * 
 * @author Martin
 *
 */
public class Zahlen {
	
	private HashSet<Double> zahlen; 
	
	/**
	 * 
	 * @param z
	 */
	public Zahlen(double z){
		zahlen.add(z);
	}
	
	/**
	 * Zahl kann hinzugefuegt werden
	 */
	public void add(double z){
		zahlen.add(z);
	}
	/**
	 * gibt die Summe der Collection zurueck
	 * @return die Summe
	 */
	public double summe(){
		int x=0;
		for(double z:zahlen){
			x+=z;
		}
		return x;
	}
	/**
	 * gibt das Maximum zurueck
	 * @return
	 */
	public double max(){
		return Collections.max(zahlen);
	}
	/**
	 * Gibt das Minimum zurueck
	 * @return 
	 */
	public double min(){
		return Collections.min(zahlen);
	}
	
}
