import java.math.*;
public class Problem_3 {
	public static void main(String[] args) {
		double r1 = 5.4;
		double r2 = 7.2;
		double r3 = 11;
		
		double a = Math.pow(r1,2)*3.14;
		double b = Math.pow(r2,2)*3.14;
		double c = Math.pow(r3,2)*3.14;
		
		System.out.println("The area of r1 is; " + a);
		System.out.println("The area of r2 is; " + b);
		System.out.println("The area of r3 is; " + c);

		double t = a + b + c;
		System.out.print("The sum of the areas is:" + t);
}
}
