package weber_straeszler_steinwender;

public class Rauminhalt {
	
	/**
	 * Returns the value of the volume from a pyramid
	 * the given values are the base and the height
	 * @param g
	 * @param h
	 * @return volume of a pyramid
	 */
	public double pyramid(double g, double h){
		return 1/3 *g*h;
	}
	/**
	 * Returns the value of the volume from a cone
	 * the given values are the base and the height
	 * @param g
	 * @param h
	 * @return volume of a cone
	 */
	public double coneGH(double g, double h){
		return 1/3 *g*h;
	}
	/**
	 * Returns the value of the volume from a cone
	 * the given values are the radius and the height
	 * @param r
	 * @param h
	 * @return volume of a cone
	 */
	public double conePIrh(double r, double h){
		return 1/3*Math.PI*Math.pow(r, 2)*h; 
	}
	/**
	 * Returns the value of the volume from a cuboidt
	 * the given value is the side of the cuboid
	 * @param a
	 * @return volume of a cuboid
	 */
	public double cuboid(double a){
		return Math.pow(a, 3);
	}
}
