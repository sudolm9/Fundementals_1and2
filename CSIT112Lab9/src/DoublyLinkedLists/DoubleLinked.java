package DoublyLinkedLists;

//***************************************************************
//DoubleLinked.java
//
//A class using a doubly linked list to represent a list of integers.
//
//***************************************************************
public class DoubleLinked {
	private IntNode list;

	// ----------------------------------------------
	// Constructor -- initializes list
	// ----------------------------------------------
	public DoubleLinked() {
		list = null;
	}

	// ----------------------------------------------
	// Prints the list elements
	// ----------------------------------------------
	public void print() {
		for (IntNode temp = list; temp != null; temp = temp.next)
			System.out.println(temp.val);
	}

	// ----------------------------------------------
	// Adds new element to front of list
	// ----------------------------------------------
	public void addToFront(int val) {
		IntNode newNode = new IntNode(val);
		newNode.next = list;
		if (list != null)
			list.prev = newNode;
		list = newNode;
	}

	// ADD TO BACK
	public void addToBack(int val) {
		IntNode newNode = new IntNode(val);
		newNode.next = list;
		if (list != null)
			// list.prev = newNode;
			list = newNode;
	}

	public void removeFirst() {
		if (list != null) {
			list = list.next;
		}

	}

	public void removeLast() {
		IntNode temp = list;
		while (list.next.next != null) {
			list = list.next;
		}
		list.next = null;
		list = temp;
	}

	public void remove(int oldVal) {
		IntNode now = list;
		IntNode prev = list;
		while (now != null && now.val != oldVal) {
			prev = now;
			now = now.next;
		}
		if (now != null)
			;
		prev.next = now.next;
		now = now.next;
		now.prev = prev;
	}

	// ***************************************************************
	// An inner class that represents a list element.
	// ***************************************************************
	private class IntNode {
		public int val;
		public IntNode next;
		public IntNode prev;

		public IntNode(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
}