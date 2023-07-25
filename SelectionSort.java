package lab;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The unsorted array is:");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		System.out.println("The sorted array is:");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
