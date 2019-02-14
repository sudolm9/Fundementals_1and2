/*
 * 
 */
package game;
// TODO: Auto-generated Javadoc

/**
 * The Class Division.
 *
 * This class handles the division of two values
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Division implements BinOperation{

	/* (non-Javadoc)
	 * @see test.BinOperation#evaluate(double, double)
	 */
	@Override
	public double evaluate(double left, double right) {
		// No handling of error, this should throw an exception
		return (right==0)?0:left/right;
	}
	
	// Overload for other data types
}
