package LinkedLists;

public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList()
	{
		head=null;
	}
	
	public void addAtBegin(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}
		
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addAtEnd(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}
		
		else {
			Node currNode=head;
			
			while(currNode.next !=null)
			{
				currNode=currNode.next;
			}
			currNode.next=newNode;
		}
		
	}
	
	public void addAtPos(int data,int pos)
	{
		Node newNode = new Node(data);
		
		if(pos==0)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			Node currNode=head;
			int currPos=0;
			
			while(currNode != null && currPos < pos -2)
			{
				currNode=currNode.next;
				currPos++;
			}
			newNode.next=currNode.next;
			currNode.next=newNode;
			
		}
				
	}
	
	public void delByPos(int pos) {	
		if(pos==0)
		{
			head=head.next;
		}
		else {
		Node prevNode=head;
		Node currNode=prevNode.next;
		
		int currPos=0;
		while(prevNode != null && currPos < pos-1)
		{
			prevNode=prevNode.next;
			currNode=currNode.next;
			currPos++;
		}
		
		prevNode.next=currNode.next;
		currNode.next=null;
		}
		
	}
	
	public void display()
	{
		Node currNode=head;
		
		while(currNode != null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println();
	}
}
