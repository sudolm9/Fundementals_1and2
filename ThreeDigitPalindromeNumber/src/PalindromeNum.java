
public class PalindromeNum {

	public static void main(String[] args) {

		int number = 1;

		int palindrome;
		int greatestPalindrome = 0;
		for (int a = 999; a >= 100; a--) {
			for (int b = 999; b >= 100; b--) {// range from 999 down through 100
				number = a * b + 2;

				if (isPalindrome(Integer.toString(number))) {
				

					palindrome = number;
					if (palindrome > greatestPalindrome) {//if the palindrome is greater than the greatestPalindrome than the greatestPalindrome is the palindrome
						greatestPalindrome = palindrome;
						
					}
				}
			}

					}
		System.out.println("Greatest palindrome is: " + greatestPalindrome);// prints the greatest palindrome
				}
				
			
public static boolean isPalindrome(String f) { //converts into a string
		String string = "";
		for (int i = f.length(); i > 0; i--) {
			string += f.charAt(i - 1); // checks each number individually 
		}
		if (f.equals(string)) { // if f equals or doesn't equal the string than returns true or false, depending on the situation
			return true;
		}
		return false;
			}

	
	{
	}
	
}

