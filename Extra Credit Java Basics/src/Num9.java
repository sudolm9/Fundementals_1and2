import java.util.Scanner;
public class Num9 {

	public static void main(String[] args) {
		  int num1, num2, value;

		  Scanner scan = new Scanner(System.in);

		      System.out.print("Enter two integers: ");

		      num1 = scan.nextInt();

		      num2 = scan.nextInt();

		      value = (int) (Math.pow(num1, 3) + Math.pow(num2, 3));

		      System.out.println( value);

		   }
	}


