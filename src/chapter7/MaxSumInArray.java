package chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента.
 * Да се намерят тези K елемента, които имат максимална сума.
 */
public class MaxSumInArray {

		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//No need to initialize n, 0 is default value of integers
		int n = 0, k;
		int[] array;
		
		do{
			System.out.println("N = ");
			n = scan.nextInt();
			System.out.println("K = ");
			k = scan.nextInt();
			array = new int[n];
		}while(n < k);
		
		int length = array.length;
		
		for(int i1 = 0; i1 < n; i1++){
			System.out.printf("array[%d] = ", i1);
			array[i1] = scan.nextInt();
		}

		//Extract this in method
		for(int i = 0; i < length - 1; i++){
			for(int j = i + 1; j < length; j++){
				if(array[i] > array[j]){
					int tempEl = array[i];
					array[i] = array[j];
					array[j] = tempEl;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		for(int j = 0; j < k; j++){
			int lastElement = array[length - j - 1];
			System.out.printf("%d%n", lastElement);
		}
				
		scan.close();
	}
}
