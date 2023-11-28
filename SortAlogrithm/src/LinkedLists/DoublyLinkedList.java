package LinkedLists;

public class DoublyLinkedList {

	Node head;
	
	public DoublyLinkedList()
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
		else
		{
			newNode.next=head;
			head.prev=newNode.next;
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
		
		else
		{
			Node currNode=head;
			
			while(currNode.next != null)
			{
				currNode=currNode.next;
			}
			
			currNode.next=newNode;
			newNode.prev=currNode;
		}
	}
	
	
	public void addAtPos(int data,int pos)
	{
		Node newNode = new Node(data);
		
		if(pos==0)
		{
			newNode.next=head;
			head.prev=newNode.next;
			head=newNode;
		}
		
		else
		{
			Node currNode=head;
			int currPos=0;
			while(currPos < pos-1 && currNode.next != null )
			{
				currNode=currNode.next;
				currPos++;
			}
			
			newNode.next=currNode.next;
			newNode.prev=currNode;
			currNode.next=newNode;
			
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
