package Parentheses;

//********************************************************************
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************
import java.util.Scanner;
import java.util.Stack;

public class ParenMatch {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println("\nParenthesis Matching");
		System.out.print("Enter a parenthesized expression: ");
		line = scan.nextLine();
		int len = line.length();
		System.out.println("\nMatches and Mismatches:\n");
		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < len; i++) {
			char ch = line.charAt(i);
			if (ch == '(')
				s.push(i);
			else if (ch == ')') {
				try {
					int p = s.pop() + 1;
					System.out.println("')' at position " + (i + 1) + " matched with ')' at position " + p);
				} catch (Exception e) {
					System.out.println("')' at position " + (i + 1) + " is unmatched");
				}
			}
		}
		while (!s.isEmpty())
			System.out.println("'(' at position " + (s.pop() + 1) + " is unmatched");
	}
}