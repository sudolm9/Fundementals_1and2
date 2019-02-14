/*
Author: Matthew Meyers
 * 
 */
package game;

/**
 * The Interface BinOperation.
 * Implemented by Addition, Subtraction, Multiplication, Division
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public interface BinOperation {

	/**
	 * Evaluate.
	 *
	 * @param left the left
	 * @param right the right
	 * @return the double
	 */
	public double evaluate(double left, double right);
	
}
