package javaDsa;

import java.util.Scanner;

public class Searching {
	
	

	public static void main(String[] args) {
		

		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter numbers in array: ");
		   arr[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Enter number to be searched");
		int search=sc.nextInt();
//		System.out.println("For linear search: ");
//		
//		for(int i=0;i<arr.length;i++) {
//			if(search==arr[i]) {
//				System.out.println("number found at position: "+i);
//				break;
//			}
//		}
		
		int f=0,l=arr.length-1;
		System.out.println("For binary search: ");
		while(f<=l) {
			int mid=(f+l)/2;
			if(arr[mid]==search) {
				System.out.println("number found at: "+mid);
				break;
			}else if(arr[mid]<search){
				f=mid+1;
			}else {
				l=mid-1;
			}
		}
		
		
		
		
		
	}

}
