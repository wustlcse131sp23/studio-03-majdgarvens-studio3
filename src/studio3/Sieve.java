package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("N: ");
		int n = in.nextInt();

		
		int[] array = new int[n];
		// filling out the array
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			//System.out.println(array[i]);
		}
		
		for (int i = 2; i < array.length; i++) {
		
		if (array[i] == -1) {
			
		}
		else {
			 for (int j = i * i; j < n; j = j+ i ) {
				 array[j] = -1;
			 }
		 }}
		System.out.println("List of Primes:");
		for (int m = 2; m < array.length; m++) {
			if (array[m]!= -1) {
				System.out.println(m);
			}
		}
		
		
			
		
		
		
		
		
		

		
		
		
	}

}
