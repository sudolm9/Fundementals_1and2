
// ******************************************************************
// Backwards.java
//
// Uses a recursive method to print a string backwards.
// ******************************************************************
import java.util.Scanner;

public class Backwards {

	// --------------------------------------------------------------
	// Reads a string from the user and prints it backwards.
	// --------------------------------------------------------------
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputStr;
		System.out.print("Enter a string: ");
		inputStr = scan.nextLine();
		System.out.println(printBackwards(inputStr));
	}

	// ---------------------------------------------------------------
	// Takes a string and recursively prints it backwards.
	// ---------------------------------------------------------------
	public static String printBackwards(String s) {
		if (s.length() == 1){
			return s;
	}
		return printBackwards(s.substring(1, s.length()))+s.charAt(0);
	}
}