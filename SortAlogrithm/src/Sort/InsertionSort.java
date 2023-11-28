package Sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {100,8,1,45,7};
		int n = arr.length;
		
		for(int i=1;i<n;i++)
		{
			int key = arr[i];
			int j=i-1;
			
			for(;j>=0 && arr[j]>key;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			
		}
		System.out.println(Arrays.toString(arr));
  
	}

}
