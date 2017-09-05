package chapter10;

import java.util.Scanner;

public class SumN {
	//Name is not proper. When you have is/are/has this means the method should return a boolean
	public static void getSum(int[] arr, int sum){
		for(int i = 0; i < arr.length; i++){
			int first = arr[i];
			for(int j = i + 1; j < arr.length; j++){
				int second = arr[j];
				if((first + second) == sum){
					System.out.printf("(%d, %d) ", first, second);
				}else{
					System.out.println("0 matches were found.");
				}
			}
		}
	}
	//Never use this in your code
	int value;
	
//	Даден е масив с цели числа и число N. Напишете програма, която
//	намира всички подмножества от числа от масива, които имат сума N
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int length = scan.nextInt();
		int[] array = new int[length];
		
		System.out.println("Enter sum: ");
		int sum = scan.nextInt();
		
		scan.nextLine();
		
		for(int i = 0; i < length; i++){
			System.out.printf("array[%d] = ", i);
			array[i] = scan.nextInt();
		}
		
		getSum(array, sum);
		
		scan.close();
	}
}
