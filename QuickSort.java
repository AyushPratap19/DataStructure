package lab;
import java.util.*;

public class QuickSort {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter choice:\n1:Best Case\n2:Worst Case\n3:Average Case");
		int ch = sc.nextInt();
		//while(true) {
		switch(ch) {
			case 1 -> {
				System.out.println("Best case");
				for(int i=0;i<n;i++)
					arr[i] = i;
			}
			case 2-> {
				System.out.println("Worst case");
				for(int i=0;i<n;i++)
					arr[i] =ran.nextInt(n);
			}
			case 3-> {
				System.out.println("Average case");
				for(int i=0;i<n;i++)
					arr[i] = ran.nextInt(n);
			}
		}
		
		System.out.println("Unsorted array");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		long start = System.nanoTime();
		quickSort(arr,0, n-1);
	    long stop = System.nanoTime();
		System.out.println();
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nTime taken to sort" + (stop - start));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low <= high) {
			int j = partition(arr, low, high);
			quickSort(arr, low, j-1);
			quickSort(arr, j+1, high);
		}
	}
	public static int partition(int[] arr , int s , int e){

        int pivot = arr[s];
        int count = 0;
        //count of elements smaller than pivot element
        for(int i = s + 1; i <= e; i++){
            if(arr[i] <= pivot)
                count++;
        }

        int pivotIdx = s + count;

        //put pivot element at correct position
        int temp = pivot;
        arr[s] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int sIdx = s;
        int eIdx = e;

        //make smaller elementsacceptRandom(arr1,n); lie before pivot & larger elements after pivot
        while(sIdx < pivotIdx && eIdx > pivotIdx){

            //move sIdx++ till we find element greater than pivot element in left side
            while(arr[sIdx] <= pivot){
                sIdx++;
            }
            //move eIdx-- till we find smaller elements than pivot in right side
            while(arr[eIdx] > pivot){
                eIdx--;
            }
            //swap the values if found
            if(sIdx < pivotIdx && eIdx > pivotIdx){
                temp = arr[sIdx];
                arr[sIdx] = arr[eIdx];
                arr[eIdx] = temp;

                sIdx++;
                eIdx--;
            }
        }
        return pivotIdx;
    }

public static void selectionSort(int[] arr){  
    for (int i = 0; i < arr.length - 1; i++)  
    {  
        int index = i; 
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] < arr[index]){  
                index = j;//searching for lowest index  
            }  
        }  
        int smallerNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallerNumber;  
    }  
}  
   
public static void main(String a[]){  
  int[] arr1 = {9,14,3,2,43,11,58,22};  
	System.out.println("Before Selection Sort");  
    for(int i:arr1){  
        System.out.print(i+" ");  
    }  
    System.out.println();  
      
    selectionSort(arr1);//sorting array using selection sort  
     
    System.out.println("After Selection Sort");  
    for(int i:arr1){  
        System.out.print(i+" ");  
    }  
   
   	}
}  



