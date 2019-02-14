package test;
/**
 * 
 * @author m_alrajab
 * This class handles the subtraction of two values
 */
public class Subtraction implements BinOperation{
	@Override
	public double evaluate(double left, double right) {
		return left-right;
	}
	
	// Overload for other data types
}
