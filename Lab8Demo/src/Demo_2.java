

public class Demo_2 {

	public String textStats (String txt) {
		int vcount = 0, spaceCount = 0, other = 0;
		String str = "Montclair State University is a public research university located in the Upper Montclair section of Montclair, the Great Notch area of Little Falls, and the Montclair Heights section of Clifton, in the U.S. state of New Jersey.";
		
		for (int index = 0; index < txt.length(); index++) {
			switch (txt.charAt(index)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':	
			case 'u':
				vcount++;
				break;
			case ' ':
				spaceCount++;
				break;
			default:
				other++;
			}
		}
	str = " The number of words is: " + spaceCount +
			" \nThe number of vowels is: " + vcount +
			" \nThe total number of char is: " + (vcount+ other);
	return str;
	}

}
