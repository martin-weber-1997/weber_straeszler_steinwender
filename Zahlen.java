package weber_straeszler_steinwender;

<<<<<<< HEAD
public class Zahlen {

=======
import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse die Berechnungen von Zahlen erm�glicht
 * 
 * @author Martin
 * @version 1.0
 */
public class Zahlen {
	
	private LinkedList<Double> zahlen; 
	
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
	
>>>>>>> d1fff75c7bebe47d606b60221c589fd4cbbccfdc
}
