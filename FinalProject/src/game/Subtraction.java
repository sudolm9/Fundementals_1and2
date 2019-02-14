/*
 * 
 */
package game;
// TODO: Auto-generated Javadoc

/**
 * The Class Subtraction.
 *
 * This class handles the subtraction of two values
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Subtraction implements BinOperation{
	
	/* (non-Javadoc)
	 * @see test.BinOperation#evaluate(double, double)
	 */
	@Override
	public double evaluate(double left, double right) {
		return left-right;
	}
	
	// Overload for other data types
}
