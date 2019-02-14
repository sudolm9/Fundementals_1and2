import java.util.*;
public class Problem_3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int GCD;
		Scanner imput = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		num1 = imput.nextInt();
		System.out.print("Enter your second number: ");
		num2 = imput.nextInt();
		
		if(num1 > num2)
			GCD = num2;
		else
			GCD = num1;
		while((num1 % GCD != 0)||(num2 % GCD != 0)){
			GCD--;
		}
	System.out.printf("The GCD for %d and %d is %d: ", num1, num2, GCD); //prints both numbers and their GCD
}
}
