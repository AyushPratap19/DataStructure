package lab;
import java.util.*;

public class MergeSort {
	
	public static void merge(int[] a, int low, int mid, int high) {
		int i = low, j = mid+1, k = low;
		int c[] = new int[400];
		while(i <= mid && j <= high) {
			if(a[i] < a[j]){
				c[k] = a[i];
				k++;
				i++;
			}
			else {
				c[k] = a[j];
				k++;
				j++;
			}
		}
		while(i <= mid)
		{
			c[k] = a[i];
			k++;
			i++;
		}
		while(j <= high)
		{
			c[k] = a[j];
			k++;
			j++;
		}
		for(int l=low;l<=high;l++)
			a[l] = c[l];
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		int mid;
		if(low < high) {
			mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[400];
		
		System.out.println("Enter your choice of input\n1:Best case: sorted array\n2:Worst case: fully unsorted array\n3:Average case: random array");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 -> {
				for(int i=0;i<400;i++)
					arr[i] = i;
			}
			case 2 -> {
				for(int j = 0,i=400-1;i>=0;i--,j++)
					arr[i] = j;
			}
			case 3 -> {
				Random r = new Random();
				for(int i=0;i<400;i++)
					arr[i] = r.nextInt(400);
			}
		}
		
		System.out.println("Unsorted array");
		for(int i=0;i<400;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		long startTime = System.nanoTime();
		MergeSort.mergeSort(arr, 0, 400-1);
		long stopTime = System.nanoTime();
		long elapseTime = stopTime - startTime;
		System.out.println("\nTime taken for merge sort: " + elapseTime + "\n");
		
		
		System.out.println("\nSorted array");
		for(int i=0;i<400;i++)
			System.out.print(arr[i] + " ");
	}
}
