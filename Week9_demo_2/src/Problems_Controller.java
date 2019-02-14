
public class Problems_Controller {

	public int sumOfSquares(int num){
		int sum = 0;
		for(int i = 1; i <+num;i++)
			sum = sum + i*i;
		
		return sum;
	}
	public int squareOfSum(int num){
		int sum = 0;
		for(int i = 1; i <=num;i++)
			sum = sum + i;
		
		return sum*sum;
  }

}
