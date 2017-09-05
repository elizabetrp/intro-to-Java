package chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента.
 * Да се намерят тези K елемента, които имат максимална сума.
 */
public class MaxSumInArray {

	//Extract this in method
	private static void swapElements(double[] arr){
		int length = arr.length;
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < length; j++){
				if(arr[i] > arr[j]){
					double tempEl = arr[i];
					arr[i] = arr[j];
					arr[j] = tempEl;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//No need to initialize n, 0 is default value of integers
		int n, k;
		double[] array;
		
		do{
			System.out.println("N = ");
			n = scan.nextInt();
			System.out.println("K = ");
			k = scan.nextInt();
			array = new double[n];
		}while(n < k);
		
		EqualArrays.fillArray(n, "array", array);
		
		swapElements(array);
		
		System.out.println(Arrays.toString(array));
		
		for(int j = 0; j < k; j++){
			double lastElement = array[array.length - j - 1];
			System.out.printf("%f%n", lastElement);
		}
				
		scan.close();
	}
}
