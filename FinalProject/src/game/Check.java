/*
 * 
 */
package game;

// TODO: Auto-generated Javadoc
/**
 * The Class Check.
 * 
 * This class checks 4 ints from an array and returns a String of a mathematical equation of the 4 numbers that will equal 24, or
 * returns No Answer Found
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Check {

	/**
	 * Check answer.
	 *
	 * @param operands the operands
	 * @return the string
	 */
	public static String checkAnswer(int[] operands) {

	    char[] operations = new char[] { '+', '-', '*', '/' };
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + operands[0] + operations[i] + operands[1] + operations[j]
	                            + operands[2] + operations[k] + operands[3];
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + "(" + operands[0] + operations[i] + operands[1] + ")"  + operations[j] + "(" +
	                            + operands[2] + operations[k] + operands[3] + ")";
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + operands[0] + operations[i] + "(" + operands[1] + operations[j]
	                            + operands[2] + ")" + operations[k] + operands[3];
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + "(" + operands[0] + operations[i] + operands[1] + ")"  + operations[j] +
	                            + operands[2] + operations[k] + operands[3];
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + operands[0] + operations[i] + operands[1]  + operations[j] + "(" +
	                            + operands[2] + operations[k] + operands[3] + ")";
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            for (int k = 0; k < 4; k++) {
	                    String exp = "" + "(" + operands[0] + operations[i] + operands[1]  + ")" + operations[j] + "("
	                            + operands[2] + ")" + operations[k] + operands[3];
	                    String res = EvaluateArithmeticExpParanthesis.processExpression(exp).toString();
	                    if (Double.valueOf(res).intValue() == 24) {
	                        return exp;
	                    }
	                }
	            }
	        }
	    
	    
	    
	    return "No Answer Found...";
	}
	
	
	
	
	/**
	 * The main method.
	 * 
	 * Only used under testing circumstances
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//System.out.println(Check.checkAnswer(new int[]{2,13,5, 3}));
		
		
	}

}
