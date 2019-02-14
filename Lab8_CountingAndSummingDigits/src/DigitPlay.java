// ******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// ******************************************************************
import java.util.Scanner;

public class DigitPlay {
	public static void main(String[] args) {
		int num; // a number
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("Please enter a positive integer: ");
		num = scan.nextInt();
		if (num <= 0)
			System.out.println(num + "isn't positive");
		else{
			if(sumDigits(num)%7==0)
			System.out.println("Valid");
		else {
			System.out.println("Not Valid");
			System.out.println();
		}
		}
	}

	// -----------------------------------------------------------
	// Recursively counts the digits in a positive integer
	// -----------------------------------------------------------
	public static int sumDigits(int num) {
		if (num < 10)
			return (1);
		else
			return (num%10 + sumDigits(num / 10));
	}
}