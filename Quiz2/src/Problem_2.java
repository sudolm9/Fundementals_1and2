import java.util.*;
	public class Problem_2 {

		public static void main(String[] args) {
	System.out.println(gcd(1253400,1231200));
		}
		static int gcd(int x, int y)
		{
			int r = 0, a, b;
			a= (x> y) ? x : y;
			b = (x< y) ? x : y;
			r = b;
			while(a % b != 0)
			{
				r = a % b;
				a = b;
				b = r;
			}
			return r;

}
	}
