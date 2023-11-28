package LinkedLists;

public class TestLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addAtBegin(10);
		sl.addAtEnd(30);
		sl.display();
		sl.addAtBegin(5);
		sl.addAtEnd(40);
		sl.display();
		sl.addAtPos(35,4);
		sl.display();
		sl.delByPos(0);
		sl.display();

	}

}
