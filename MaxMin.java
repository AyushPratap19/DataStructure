package lab;
import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] a = new int[10];
		for(int i=0;i<10;i++)
			a[i] = r.nextInt(10);
		int larger = a[0];
		for(int i=0;i<10;i++)
		{
			if(a[i] > larger)
				larger = a[i];
		}
		
		int smaller = a[0];
		for(int i=1;i<10;i++)
		{
			if(a[i] < smaller)
				smaller = a[i];
		}
		
		System.out.println("Array:");
		for(int i=0;i<10;i++)
			System.out.print(a[i] + " ");
		System.out.println("Largest: " + larger);
		System.out.println("Smallest: " + smaller);
	}

}
