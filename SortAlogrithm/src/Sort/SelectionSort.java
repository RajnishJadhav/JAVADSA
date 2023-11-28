package Sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {10,8,1,45,7};
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++)
	{
		int min=i;
		for(int j=i+1;j<n;j++)
		{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
