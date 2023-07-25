package lab;
import java.util.*;

public class LinearSearch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key to be searched");
		int key = sc.nextInt();
		boolean found = false;
		
		long startTime = System.nanoTime();
		for(int i=0;i<n;i++)
		{
			if(arr[i] == key)
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found in the given array");			
		}
		long stopTime = System.nanoTime();
		long elapseTime = (stopTime - startTime);
		System.out.println("Time taken: " + elapseTime + " microseconds");
	}
}
