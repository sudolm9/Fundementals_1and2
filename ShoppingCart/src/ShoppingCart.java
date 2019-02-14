
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;

public class ShoppingCart {
	private int itemCount; // total number of items in the cart
	private double totalPrice; // total price of items in the cart
	private int capacity;
	private Item[]cart;// current cart capacity
	// ---------------------------------------------------------
	// Creates an empty shopping cart with a capacity of 5 items.
	// ---------------------------------------------------------

	public ShoppingCart() {
		capacity = 5;
		itemCount = 0;
		totalPrice = 0.0;
	}

	// -----------------------------------------------------
	// Adds an item to the shopping cart.
	// -----------------------------------------------------
	public void addToCart(String itemName, double price, int quantity) {
		Item temp = new Item(itemName, price, quantity);
		totalPrice += (price * quantity);
		cart[itemCount] = temp;
		itemCount += capacity;
		{
			increaseSize();
		}
		
	}

	// -----------------------------------------------------
	// Returns the contents of the cart together with
	// summary information
	// -----------------------------------------------------
	public String toString(Object[] cart) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";
		contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
		for (int i = 0; i < itemCount; i++)
			contents += cart[i] + "\n";
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		return contents;
	}

	// -----------------------------------------------------
	// Increases the capacity of the shopping cart by 3
	// -----------------------------------------------------
	private void increaseSize() {
		Item[] temp = new Item[capacity+3];
		for(int i=0; i < capacity; i++)
		{
			temp[i] = cart[i];
		}
		cart=temp;
		temp=null;
		capacity = cart.length;
	}
}