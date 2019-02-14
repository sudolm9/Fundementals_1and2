import java.text.NumberFormat;

public class ShoppingCart {
	private int itemCount;
	private double totalPrice;
	private int capacity;
	private Item[] cart;

	public ShoppingCart() {
		capacity = 3;
		itemCount = 0;
		totalPrice = 0.0;
		cart = new Item[capacity];
	}

	public void addToCart(String itemName, double price, int quantity) {
		cart[itemCount++] = new Item(itemName, price, quantity);
		totalPrice += price * quantity;
		if (itemCount == capacity) // if full, this increases the size of the cart
									

			increaseSize();
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";
		contents += "\nItem\tPrice\tQty\tTotal\n";
		for (int i = 0; i < itemCount; i++)
			contents += cart[i].toString() + "\n";
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		return contents;
	}

	private void increaseSize() {
		Item[] tempItem = new Item[capacity];
		capacity *= 2; // double the size of capacity

		for (int i = 0; i < itemCount; i++) {
			tempItem[i] = cart[i];
		}
		cart = new Item[capacity];
		for (int i = 0; i < itemCount; i++) {
			cart[i] = tempItem[i];
		}

	}

	public double getTotalPrice() {
		return totalPrice;
	}
}
