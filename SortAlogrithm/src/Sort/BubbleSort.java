package Sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {10,8,1,45,7};
		int n = arr.length;
		int temp;
		boolean flag;
		for(int i=0;i<n; i++)
{            
			flag=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
					
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
		
		
		

	}

}
