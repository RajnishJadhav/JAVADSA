package stacksAndQueues;


public class QueueLinkedList {
	
	Node front = null, rear = null;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}else {
			
			rear.next = newNode;
			rear = newNode;
		}	
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Is empty");
		}else {
			int data = front.data;
			Node curr = front;
			front = front.next;
			curr.next = null;
			curr = null;
			
			System.out.println(data);
		}
	}
}

