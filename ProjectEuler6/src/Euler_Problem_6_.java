
public class Euler_Problem_6_<sudolm9> {

	public static void main(String[] args) {
		int sum = 0;
		for(int k = 1; k <= 100; k++){ // range of first hundred natural numbers
			sum += k * k;
		}
		int sum2 = 5050 * 5050; //5050 is the sum of all numbers between 1 and 100
		System.out.println(sum2-sum); //prints the results

	}
}
