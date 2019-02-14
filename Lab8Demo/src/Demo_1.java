import java.util.Scanner;
public class Demo_1 {

	public static void main(String[] args) {
		Scanner inScan = new Scanner(System.in);
		
		System.out.println("Enter a grade: ");
		int grade = inScan.nextInt();
		
		System.out.println((grade > 60)?"Good Job":
			(grade <30)? (grade <10)? "Try something else": "Bad Job" : "Try Again" );



	}

}
