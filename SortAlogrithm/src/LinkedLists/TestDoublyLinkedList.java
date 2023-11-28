package LinkedLists;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addAtBegin(20);
		dl.addAtBegin(10);
		dl.display();
		dl.addAtEnd(30);
		dl.addAtEnd(40);
		dl.display();
		dl.addAtPos(35, 4);
		dl.display();

	}

}
