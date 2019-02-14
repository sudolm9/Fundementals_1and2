/*
 * 
 */
package game;


/**
 * The Class Multiplication.
 * 
 * This class handles multiplication of two values
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Multiplication implements BinOperation{

	/* (non-Javadoc)
	 * @see test.BinOperation#evaluate(double, double)
	 */
	@Override
	public double evaluate(double left, double right) {
		return left*right;
	}
	
	// Overload for other data types

}
