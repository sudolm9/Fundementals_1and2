
public class Problem_1 {

	public static void main(String[] args) { {
		int ecount = 0, ncount = 0, scount = 0, Ncount = 0, Scount = 0;
		String str = "Montclair State University is a public research university located in the Upper Montclair section of Montclair, the Great Notch area of Little Falls, and the Montclair Heights section of Clifton, in the U.S. state of New Jersey. ";
		
		for (int index = 0; index < str.length(); index++) {// finds the total of each letter
			switch (str.charAt(index)) {
			case 'e':
				ecount++;
				break;
			case 's':
				scount++;
				break;
			case 'S':
				Scount++;
				break;
			case 'N':
				Ncount++;
				break;
			case 'n':
				ncount++;
				break;
			}
			 
			
		}
		int a = ecount*(scount+Scount)*(ncount+Ncount); // finds the product of all the sums of the letters multiplied
		 System.out.println(" The total of E's,N's and S's multiplied is: " + a); //prints the product
			
		
		System.out.println (" The number of e's is: " + ecount + // prints the total of each letter of each letter
			" \n the total number of s's is: " + (scount + Scount) +
			" \n the total number of n's is: " + (ncount+Ncount));
		

	}
	}
}

