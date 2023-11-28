package Sort;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {
		int[] arr= {10,5,1,23,15,11};
		
		System.out.println("UnSorted array: ");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int start, int end) {
		
		if(start<end)
		{
			int mid = (start+end)/2;
			
			mergeSort(arr,start,mid);
			mergeSort(arr,(mid+1),end);
			merge(arr,start,end,mid);
		}
		
	}

	private static void merge(int[] arr, int start, int end, int mid) {
				
		int s1 = (mid+1)-start;
		int s2 = end-mid;
		
		int leftArr[] = new int[s1];
		int rightArr[] = new int[s2];
		

		
			for(int i=0;i<s1;i++)
			{
				leftArr[i]=arr[start+i];
			}
			
			for(int j=0;j<s2;j++)
			{
				rightArr[j]=arr[mid+1+j];
			}
			
			int i=0;
			int j=0;
			int k=start;
			
			while(i<s1 && j<s2)
			{
				if(leftArr[i]<rightArr[j])
				{
					arr[k]=leftArr[i];
					i++;
					k++;
				}
				else {
					arr[k]=rightArr[j];
					j++;
					k++;
				}
				
			}
			
			while(i<s1)
			{
				arr[k]=leftArr[i];
				i++;
				k++;
			}
			
			while(j<s2)
			{
				arr[k]=rightArr[j];
				j++;
				k++;
			}
		
		
	}

//	private static void mergeSort(int[] arr, int s, int e) {
//		if(s<e) {
//			int mid=(s+e)/2;
//			
//			mergeSort(arr,s,mid); 
//			mergeSort(arr,mid+1,e);
//			merge(arr,s,e,mid);
//		}
//		
//	}
//
//	private static void merge(int[] arr, int s, int e, int mid) {
//		int i,j,k;
//		int n1=mid-s+1;
//		int n2=e-mid;
//		
//		int[] leftarr=new int[n1];
//		int[] rightarr=new int[n2];
//		
//		for(i=0;i<n1;i++) {
//			leftarr[i]=arr[s+i];
//		}
//		for(i=0;i<n2;i++) {
//			rightarr[i]=arr[mid+1+i];
//		}
//		
//		i=0;
//		j=0;
//		k=s;
//		
//		while(i<n1 && j<n2) {
//			if(leftarr[i]<rightarr[j]) {
//				arr[k]=leftarr[i];
//				i++;
//				k++;
//			}else
//			{
//				arr[k]=rightarr[j];
//				j++;
//				k++;
//			}					
//		}
//		while(i<n1) {
//			arr[k]=leftarr[i];
//			i++;
//			k++;
//		}
//		while(j<n2) {
//			arr[k]=rightarr[j];
//			j++;
//			k++;
//		}
//		
//	}

}
