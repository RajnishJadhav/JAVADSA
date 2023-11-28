package stacksAndQueues;


public class MyStack {
	
	private int[] arr;
	private int top;
	private int size;
	
	public MyStack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public MyStack(int n) {
		arr=new int[n];
		size=n;
		top=-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
   public boolean isFull() {
		return size==-1;
	}
  
   public boolean stackPush(int n) {
	   if(isFull()) {
		   System.out.println("stackOverflow");
		   return false;
	   }
	   else {
		   top++;
		   arr[top]=n;
		   return true;
	   }
   }
   
   public int stackPop() {
	   if(isEmpty()) {
		   System.out.println("stackUnderflow");
		   return -1;
	   }
	   else {
		   int n=arr[top];
		   top--;
		   return n;
	   }
   }
   public static void main(String[] args) {
		
		  MyStack ob=new MyStack(5);
		  ob.stackPush(10);
		  ob.stackPush(1);
		  ob.stackPush(7);
		  ob.stackPush(5);

		  ob.stackPush(3);
		  while(!ob.isEmpty()) {
			  System.out.println(ob.stackPop());
		  }
		  
	}
}
