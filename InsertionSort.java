package lab;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter a choice\n1: Best Case\n2: Worst Case\n3: Average Case");
		int ch = sc.nextInt();
		switch(ch) {
			case 1 -> { 
				for(int i=0;i<n;i++)
					arr[i] = i;
			}
			case 2 -> {
				for(int i=0;i<n;i++)
					arr[i] = n - i;
			}
			case 3 -> {
				for(int i=0;i<n;i++)
					arr[i] = ran.nextInt(n);
			}
		}
		
		long start, stop;
		start = System.nanoTime();
		insertionSort(arr, n);
		stop = System.nanoTime();
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\nTime taken to sort: " + (stop - start));
	}
	
	public static void insertionSort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int j = i - 1;
			int val = arr[i];
			while(j>=0 && arr[j] > val) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
		}
	}
}
