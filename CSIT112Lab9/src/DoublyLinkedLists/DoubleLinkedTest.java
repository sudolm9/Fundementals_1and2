package DoublyLinkedLists;

import java.util.Scanner;

public class DoubleLinkedTest {
	private static Scanner scan;
	private static DoubleLinked list = new DoubleLinked();

	// ----------------------------------------------------------------
	// Creates a list, then repeatedly prints the menu and does what
	// the user asks until they quit.
	// ----------------------------------------------------------------
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	// ---------------------------------------
	// Does what the menu item calls for.
	// ---------------------------------------
	public static void dispatch(int choice) {
		int newVal;
		switch (choice) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: // print
			System.out.println("** List elements **");
			list.print();
			break;
		case 2: // add to front
			System.out.println("Enter integer to add to front");
			newVal = scan.nextInt();
			list.addToFront(newVal);
			break;
		case 3:
			System.out.println("Enter integer to add to back");
			newVal = scan.nextInt();
			list.addToBack(newVal);
			break;
		case 4:
			System.out.println("Removing first int...");
			list.removeFirst();
			break;
		case 5:
			System.out.println("Removing last int...");
			list.removeLast();
			break;
		case 6:
			System.out.println("Enter old integer that you wish to remove");
			newVal = scan.nextInt();
			list.remove(newVal);
			break;
		default:
			System.out.println("Sorry, invalid choice");
		}
	}

	// -----------------------------------------
	// Prints the user's choices
	// -----------------------------------------
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Print list");
		System.out.println("2: Add an integer to the front of the list");
		System.out.println("3: Add an integer to the back of the list");
		System.out.println("4: Remove first integer from list");
		System.out.println("5: Remove last integer from list");
		System.out.println("6: Removes an old integer from the list");
		System.out.print("\nEnter your choice: ");
	}
}