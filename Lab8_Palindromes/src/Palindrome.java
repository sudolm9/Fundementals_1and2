import java.util.Scanner;

public class Palindrome {
	public static boolean reverse(String s){
		 if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	        	return reverse(s.substring(1, s.length()-1));
	        	return false;
	}
	  public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check:");
        String string = scanner.nextLine();
        if(reverse(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");

}
}
