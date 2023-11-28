package stacksAndQueues;

public class BalancedLiteral {

	public static void main(String[] args) {
		
		
		String str="({[[})";
		boolean ans=checkParenthesis(str);
		if(ans) {
			System.out.println("String is balanced");
		}
		else {
			System.out.println("String is unbalanced");
		}

	}

	private static boolean checkParenthesis(String str) {
		MyStringStack ob=new MyStringStack(str.length());
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				ob.push(ch);
			}else {
				if(ch==')' || ch=='}' || ch==']') {
					if(!ob.isEmpty()) {
						char ch1=ob.pop();
						if((ch=='(' && ch1!=')') || (ch=='{' && ch1!='}')
								|| (ch=='[' && ch1!=']')) {
							return false;
						}
						
					}else {
						return false;
					}
					
				}
			}
		}
		 if(ob.isEmpty()) {
			 return true;
		 }
		 else		 
		return false;
	}

}
