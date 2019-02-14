import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int feet, inches;
	    int fweight, mweight;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter feet: "); //outputs the words "Enter feet: "
		feet = in.nextInt();  // next number that is inputed is counted as a integer in feet
		System.out.print("Enter inches: ");
		inches = in.nextInt();
		
		fweight = 100 + 5*((feet*12 + inches) - 60);  //calculates weight by the height inputed
		mweight = 106 + 6*((feet*12 + inches) - 60);
		
		System.out.println("Ideal female weight: " + fweight);  //outputs the ideal weight for a female for the given height
		System.out.println("Ideal male weight: " + mweight); //outputs the ideal weight for a male for the given height
		
		System.out.println("the okay range for females is: " + (fweight * .85) + ("-") + (fweight * 1.15)); // calculates an okay range of 15% - and + of the height inputed
		System.out.println("the okay range is for males is: " + (mweight * .85) + ("-") + (mweight * 1.15));
	}

}
