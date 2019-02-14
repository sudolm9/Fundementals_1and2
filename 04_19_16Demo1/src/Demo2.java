
public class Demo2 {

	public static void main(String[] args) {
		int[][] ages = new int[3][5];
		
		for(int i =0; i<3;i++)
			for(int j =0; j<5;j++)
			ages[i][j]=i+j;
		
		for(int i =0; i<3;i++)
			for(int j =0; j<5;j++)
			System.out.print("\t" +ages[i][j] +((j==4)?"\n \n": ""));
		
		
	}
}


