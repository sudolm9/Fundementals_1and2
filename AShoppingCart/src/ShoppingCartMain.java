
import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCartMain {
	public static void main(String[] args) {

		String str;
		int qty;
		String nm;
		double prc;
		ShoppingCart myShoppingCart = new ShoppingCart();

		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		do {
			System.out.println("Enter the  name, price, and quantity of the item");
			Scanner scan = new Scanner(System.in);
			nm = scan.next(); // retrieve the name of user item input
			prc = Double.parseDouble(scan.next());
			qty = Integer.parseInt(scan.next());
			myShoppingCart.addToCart(nm, prc, qty);
			System.out.println(myShoppingCart);
			System.out.println(" continue shopping (y/n)?");
			str = scan.next();

		} while (str.equalsIgnoreCase("y"));
		// display in the proper amount based on the user input
		System.out.println("Please pay now. " + fmt.format(myShoppingCart.getTotalPrice()));
	}

}
