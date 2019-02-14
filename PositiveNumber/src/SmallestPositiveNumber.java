
public class SmallestPositiveNumber {

	public static void main(String[] args) {
		

		int g = 15;
		while(1==1)
		{
			boolean SmallestPositiveNumber = true;
			for(int i = 1; i < 15; i++) //range from 15 down
			{
				
				SmallestPositiveNumber = true;
				if(g % i != 0)
				{
					SmallestPositiveNumber = false;
					break; //breaks off the loop
				}
			}
			if(SmallestPositiveNumber)
			{
				System.out.println("The smallest positive number is: " + g);
				System.exit(0); //Stops the program
			}
			g++;
		}
	}

}
