import java.text.NumberFormat;
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	      System.out.println("Smith balance after withdrawal: " + 
	                          acct2.withdraw (430.75, 1.50));

	      acct1.addInterest();
	      acct2.addInterest();
	      acct3.addInterest();

	      System.out.println();
	      System.out.println(acct1);
	      System.out.println(acct2);
	      System.out.println(acct3);
	   }
	}
//-----------------------------------------------------------------
//  Deposits the specified amount into the account. Returns the
//  new balance.
//-----------------------------------------------------------------
public double deposit(double amount)
{
   balance = balance + amount;
   return balance;
}

//-----------------------------------------------------------------
//  Withdraws the specified amount from the account and applies
//  the fee. Returns the new balance.
//-----------------------------------------------------------------
public double withdraw(double amount, double fee)
{
   balance = balance - amount - fee;
   return balance;
}
//-----------------------------------------------------------------
//  Adds interest to the account and returns the new balance.
//-----------------------------------------------------------------
public double addInterest()
{
   balance += (balance * RATE);
   return balance;
}

//-----------------------------------------------------------------
//  Returns the current balance of the account.
//-----------------------------------------------------------------
public double getBalance()
{
   return balance;
}

//-----------------------------------------------------------------
//  Returns a one-line description of the account as a string.
//-----------------------------------------------------------------
public String toString()
{
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
  }
}




