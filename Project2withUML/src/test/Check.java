package test;

public class Check {

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
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(Check.checkAnswer(new int[]{6,1,5, 11}));
		
		
	}

}
