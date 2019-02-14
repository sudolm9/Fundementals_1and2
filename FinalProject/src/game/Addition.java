/*
 * 
 */
package game;
// TODO: Auto-generated Javadoc

/**
 * The Class Addition.
 *
 * This class handles the addition of two values
 * 
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Addition implements BinOperation{

	/* (non-Javadoc)
	 * @see test.BinOperation#evaluate(double, double)
	 */
	@Override
	public double evaluate(double left, double right) {
		return left+right;
	}

	// Overload for other data types
}
