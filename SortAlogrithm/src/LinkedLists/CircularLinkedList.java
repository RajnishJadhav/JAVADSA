package LinkedLists;

public class CircularLinkedList {

	CNode head;
	
	public CircularLinkedList()
	{
		head=null;
	}
	
	public void addAtHead(int data)
	{
		CNode newNode = new CNode(data);
		if(head==null)
		{
			head=newNode;
		}
		else {  
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void display()
	{
		CNode currNode=head;
		
		while(currNode != null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println();
	}
}
