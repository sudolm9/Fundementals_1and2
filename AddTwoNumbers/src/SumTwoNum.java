import java.util.Scanner;

public class SumTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter int num1"); // The console will display "enter num1".
		int num1 = in.nextInt();
		
		System.out.println("enter num2");
		int num2 = in.nextInt(); // This says that the next number should be counted as a integer.
		
		int sum = num1 + num2;   // This tells which two numbers will add up to the sum.
		System.out.println("The sum is: " + sum); // This line tells the console what to write when both numbers are inputed.
		
	}

}
