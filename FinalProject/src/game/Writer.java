/*
Matthew Meyers
 * 
 */
package game;

import java.io.*;  


/**
 * The Class Writer.
 * 
 * This class deals with writing user activity in Game to a log file
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class Writer {


   /**
    * Append to file.
    * 
    * This appends several lines of user activity in Game to the log file  (logbook.txt) located in Project folder
    *
    * @param sec the sec
    * @param type the type
    * @param exp the exp
    */
   public static void appendToFile (int sec, String type, String exp) {

      BufferedWriter bw = null;
      String action;
      String typename;

		if (type == "VerifyTrue") {
			action = "User was correct - TIMER ENDED";
			typename="Verify";
		} else if (type == "VerifyFalse") {
			action = "User was incorrect - GAME CONTINUES";
			typename="Verify";
		} else if (type == "VerifyError") {
			action = "User input did not match cards - GAME CONTINUES";
			typename="Verify";
		} else if (type == "FindASolution") {
			action = "GAME CONTINUES";
			typename="FindASolution";
		} else if (type == "Refresh") {
			action = "GAME RESET";
			typename="Refresh";
		} else {
			action = "Error";
			typename="ERROR";
		}
      
      try {
         // APPEND MODE SET HERE
     bw = new BufferedWriter(new FileWriter("logbook.txt", true));
	 bw.write("User pressed " + typename + " at " + sec + " seconds");
	 bw.newLine();
	 if (type=="VerifyTrue"){
		 bw.write("User expression was " + exp + " which equals " + EvaluateArithmeticExpParanthesis.processExpression(exp));
		 bw.newLine(); 
		 }
	 if (type=="VerifyFalse"){
		 bw.write("User expression was " + exp + " which equals " + EvaluateArithmeticExpParanthesis.processExpression(exp));
		 bw.newLine(); 
		 }
	 if (type=="VerifyError"){
		 bw.write("User expression was " + exp + " which equals " + EvaluateArithmeticExpParanthesis.processExpression(exp));
		 bw.newLine(); 
		 }
	 if (type=="FindASolution"){
		 bw.write("Computer generated answer was " + exp);
		 bw.newLine(); 
		 }
	 bw.write(""+action);
	 bw.newLine();
	 bw.newLine();
	 bw.flush();
      } catch (IOException ioe) {
	 ioe.printStackTrace();
      } finally {                       
	 if (bw != null) try {
	    bw.close();
	 } catch (IOException ioe2) {
	    
	 }
      }

   }

   
   /**
    * Clear file.
    * 
    * This clears the log file
    */
   public static void clearFile () {

	      BufferedWriter bw = null;

	      try {
	         // APPEND MODE SET HERE
	     bw = new BufferedWriter(new FileWriter("logbook.txt", false));
		 bw.write("NEW GAME");
		 bw.newLine();
		 bw.newLine();
		 bw.flush();
	      } catch (IOException ioe) {
		 ioe.printStackTrace();
	      } finally {                       
		 if (bw != null) try {
		    bw.close();
		 } catch (IOException ioe2) {
		    
		 }
	      }

	   }

   
   
   
} 
