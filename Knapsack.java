package lab;

import java.util.*;

public class Knapsack {
	
	public static void sortByRatio(double[] p, double[]w, double[] r, int n) {
		double temp1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(r[j] < r[j+1]) {
					
					temp1 = p[j];
					p[j] = p[j+1];
					p[j+1] = temp1;
					
					temp1 = w[j];
					w[j] = w[j+1];
					w[j+1] = temp1;
					
					temp1 = r[j];
					r[j] = r[j+1];
					r[j+1] = temp1;
				}
			}
		}
	}
	
	public static double[] solution(double[] p, double[] w, double[] r, double W, int n) {
		double[] x = new double[n];
		for(int i=0;i<n;i++)
			x[i] = 0;
		
		double weight = 0;
		for(int i=0;i<n;i++) {
			if(weight + w[i] <= W) {
				x[i] = 1;
				weight += w[i];
			}
			else {
				x[i] = (double)(W-weight)/w[i];
				weight = W;
				break;
			}
		}
		
		System.out.println("Solution");
		for(int i=0;i<n;i++)
			System.out.print(x[i] + " ");
		System.out.println();
		
		return x;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the number of items");
		int n = sc.nextInt();
		System.out.println("Enter capacity of knapsack");
		double W = sc.nextDouble();
		double[] p = new double[n];
		double[] w = new double[n];
		double[] ratio = new double [n];
		
		System.out.println("Enter profit array");
		for(int i=0;i<n;i++)
			p[i] = sc.nextDouble();
		
		System.out.println("Enter weight array");
		for(int i=0;i<n;i++)
			w[i] = sc.nextDouble();
		
		for(int i=0;i<n;i++)
			ratio[i] = (double)p[i]/w[i];
		
		sortByRatio(p, w, ratio, n);
		
		double[] x = solution(p, w, ratio, W, n);
		System.out.println("The items considered are: ");
		for(int i=0;i<n;i++) {
			System.out.println("Item " + (i+1) + ": " + x[i]);
		}
		
		double profit = 0;
		for(int i=0;i<n;i++) {
			profit = profit + (x[i]*p[i]);
			System.out.println(profit);
		}
		
		System.out.println(profit);
		sc.close();
	}
}
