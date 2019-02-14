// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {
      ArrayList<Item> cart = new ArrayList<Item>();

      Item item;
      String itemName;
      double itemPrice;
      int quantity;

      Scanner scan = new Scanner(System.in);

      String keepShopping = "y";
      ShoppingCart cart1 = new ShoppingCart();
      do
          {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart
            cart1.addToCart(itemName, itemPrice, quantity);



            // *** print the contents of the cart object using println
            System.out.println(cart1);

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
          }
      while (keepShopping.equals("y"));

    }
}