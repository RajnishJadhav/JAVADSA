package Sort;

import java.util.Scanner;

public class RecursiveAdd {
	
	static int cnt=0;
	public static int addd(int n,int[]arr) {

		if(arr[n]<1)
			return 0;
		if(arr[n]==1)
			return 1;
		cnt++;
	System.out.println(cnt);
        return arr[n]+addd(n-1,arr);
	}
	
//	int add(int n){
//		If(n<1)
//		 return 0;
//		f(n==1){
//		 Return 1;
//		}
//		return n+add(n-1);
//	}
	

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int n = arr.length-1;
          int ans=addd(n,arr);
          System.out.println(ans);
          System.out.println("count is: "+cnt);

           
           
	}

}
