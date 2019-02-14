import java.text.DecimalFormat;
public class DecimalProblem {

	public static void main(String[] args) {
		

		

		   {

		        double num1=10, num2=3;

		        DecimalFormat fmt = new DecimalFormat("0.####");

		       double frctn = num2/num1+num1/num2;

		       System.out.println(fmt.format(frctn));
	}

}
}
