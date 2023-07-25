package lab;
import java.util.*;

public class Hanoi {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of discs");
		int n = sc.nextInt();
		long start, stop;
		start = System.nanoTime();
		stop = System.nanoTime();
		hanoi(n, 'A', 'B', 'C');
		stop = System.nanoTime();
		System.out.println("\nTime taken to sort: " + (stop - start));
		System.out.println("No of moves: " + count);
	}
	
	public static void hanoi(int n, char S, char T, char D) {
		if(n==0)
			return;
		hanoi(n-1, S, D, T);
		System.out.println("Move disc from " + S + " to " + D);
		hanoi(n-1, T, S, D);
		count++;
	}
 
}
