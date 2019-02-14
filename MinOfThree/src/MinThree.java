import java.util.Scanner;
public class MinThree {

	public static void main(String[] args) {
		int num1, num2, num3,num4, min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter four integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		
	if (num1 < num2 && num1 < num3 && num1 < num4){
		min = num1;
	}else if (num2 < num1 && num2 < num3 && num2 < num4){
		min = num2;
	}else if (num3 < num1 && num3 < num2 && num3 < num4){
		min=num3;
	}else if (num4 < num3 && num4 < num2 && num4 < num1){
		min=num4;
	}
		System.out.println("Minimum value: " + min);
	}

}