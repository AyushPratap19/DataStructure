package lab;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
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
		
		int low = 0, high = n-1, mid;
		long startTime = System.nanoTime();
		while(low <= high)
		{
			mid = (low + high)/2;
			if(arr[mid] == key)
			{
				found = true;
				break;
			}
			else if(arr[mid] > key)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		long stopTime = System.nanoTime();
		long elapseTime = (stopTime - startTime);
		System.out.println("Time taken: " + elapseTime + " microseconds");
		if(found)
		{
			System.out.println("Element is found");
		}
		else
		{			
			System.out.println("Element not found");
		}
	}

}
