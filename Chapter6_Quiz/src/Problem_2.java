
public class Problem_2 {

	public static void main(String[] args) {
		Problem_2 prob2 = new Problem_2();
long answer = 0;
int counter = 1;
while(counter < 2000000){
	if(prob2.isPrime(counter)){
		answer += counter;
	}
	counter += 2;
}
System.out.println(answer + 2);
}
	public boolean isPrime(int n)
	{
		if(n==1){
			return false;
		}
		int k = (int)Math.sqrt(n);
		for(int l = 2; l <= k; l++)
		{
			if(n % l == 0)
				return false;
		}
		return true;
	}
}
