
public class Problem_1 {

	public static void main(String[] args) {
			int ecount = 0, ncount = 0, scount = 0, Ecount= 0, Scount = 0, Ncount = 0;
			String str = " Montclair State University is a public research university located in the Upper Montclair section of Montclair, the Great Notch area of Little Falls, and the Montclair Heights section of Clifton, in the U.S. state of New Jersey.";
			
			for(int index = 0; index < str.length(); index++){
				switch(str.charAt(index)){
				case'e':
					ecount++;
					break;
				case's':
					scount++;
					break;
				case'n':
					ncount++;
					break;
				case'E':
					Ecount++;
					break;
				case'S':
					Scount++;
					break;
				case'N':
					Ncount++;
					break;
				}
				
						
			}
			int a = (ecount+Ecount)*(scount+Scount)*(ncount+Ncount);
			System.out.println("The total of all the letters multiplied is: " + a); 
			
			System.out.println( "The total number of e's is: " + (Ecount +ecount) +
					" \n the total number of s's is:" + (scount + Scount) +
					" \n the total number of n's is: " +(ncount + Ncount));
			

	}

}
