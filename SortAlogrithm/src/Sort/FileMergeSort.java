package Sort;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileMergeSort {
	static List<Integer> ls = new ArrayList<>();
public static void read1()
{
	try(BufferedReader br = new BufferedReader(new FileReader("Data1.txt"))) {
		
		String str = br.readLine();
		while(str != null)
		{
			String [] arr = str.split("\n");
			ls.add(Integer.parseInt(arr[0]));
			str= br.readLine();
			
			
		}
		
	} catch (IOException e) {
		System.out.println("Error");
	}
}



public static void read2()
{
	try(BufferedReader br = new BufferedReader(new FileReader("Data2.txt"))) {
		
		String str = br.readLine();
		while(str != null)
		{
			String [] arr = str.split("\n");

			ls.add(Integer.parseInt(arr[0]));

			str= br.readLine();
			
			
		}
		
	} catch (IOException e) {
		System.out.println("Error");
	}
}


public static void mergeFile()
{
	

}

	public static void main(String[] args) {

read1();
read2();

		
		System.out.println("UnSorted Array"+ls);
		Collections.sort(ls);
		System.out.println("Sorted Array"+ls);
		
	}

}
