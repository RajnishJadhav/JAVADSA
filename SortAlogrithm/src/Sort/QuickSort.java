package Sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {10,3,1,33,12,7};
		
		System.out.println("Arrays before sorting: ");
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("Arrays after sorting: ");
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int s, int e) {
	   if(s<e) {
		   
		   int p=partition(arr,s,e);
		   quickSort(arr,s,p-1);
		   quickSort(arr,p+1,e);
	   }
		
		
	}

	private static int partition(int[] arr, int f, int l) {
		
		int piv=f;
		int i=f;
		int j=l;
		while(i<j) {
			while(i<l && arr[i]<arr[piv]) {
				i++;
			}
			while(j>piv && arr[j]>arr[piv]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[j];
		arr[j]=arr[piv];
		arr[piv]=temp;
		return j;
	}

}
