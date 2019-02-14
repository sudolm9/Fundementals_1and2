
public class ManageAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acct1, acct2;
acct1 = new Account (1000,"Sally");
acct2 = new Account(500, "Joe");
acct2 += 100;
System.out.println("Joe's new Balance is: ");
acct1 -= 50;
System.out.println("Sally's new Balance is: ");
int fee = 25;
acct1,acct2 -= fee;

		
	}

}
