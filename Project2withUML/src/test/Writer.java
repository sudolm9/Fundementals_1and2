package test;

import java.io.*; 
import java.util.Scanner;

public class Writer {


   public static void appendToFile (int sec, String type, String exp) {

      BufferedWriter bw = null;
      String action;

		if (type == "VerifyTrue") {
			action = "User was correct - TIMER ENDED";
		} else if (type == "VerifyFalse") {
			action = "User was incorrect - GAME CONTINUES";
		} else if (type == "FindASolution") {
			action = "GAME CONTINUES";
		} else if (type == "Refresh") {
			action = "GAME RESET";
		} else {
			action = "Error";
		}
      
      try {
         // APPEND MODE SET HERE
     bw = new BufferedWriter(new FileWriter("logbook.txt", true));
	 bw.write("User pressed " + type + " at " + sec + " seconds");
	 bw.newLine();
	 if (type=="VerifyTrue"){
		 bw.write("User expression was " + exp + " which equals " + EvaluateArithmeticExpParanthesis.processExpression(exp));
		 bw.newLine(); 
		 }
	 if (type=="VerifyFalse"){
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
