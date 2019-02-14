package test;
/**
 * 
 * @author m_alrajab
 * This class handles the addition of two values
 */
public class Addition implements BinOperation{

	@Override
	public double evaluate(double left, double right) {
		return left+right;
	}

	// Overload for other data types
}
