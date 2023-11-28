package stacksAndQueues;


public class StackUsingLinkedList {
	private Node top;
	class Node
	{
		int data;
		Node next;
		public Node(int n) {
			super();
			data = n;
			next = null;
		}
	}
	public StackUsingLinkedList() {
		super();
		top = null;
	}
	public boolean isNull()
{
	return top == null;
}

public void push(int n)
{
	Node newNode = new Node(n);
	if(top == null)
	{
		top = newNode;
	}
	else
	{
		Node temp = top;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
	}
}
public int pop()
{
	if(top == null)
	{
		System.out.println("stack is full");
		return -1;
	}
	if(top.next == null)
	{
		int n = top.data;
		top = null;
		return n;
	}
	else
	{
		Node temp = top;
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		int n = temp.next.data;
		temp.next = null;
		return n;
	}
}
	public static void main(String[] args) {
		StackUsingLinkedList sul = new StackUsingLinkedList();
		sul.push(10);
		sul.push(20);
		sul.push(30);
		
		while(!sul.isNull()) {
			System.out.println(sul.pop());
		}
	}
}

