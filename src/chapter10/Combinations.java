package chapter10;

import java.util.Scanner;

public class Combinations {
	public static void printCombinations(int[] arr, int index, int start, int end){
		int length = arr.length;
		if(index >= length){
			System.out.print("(");
            for(int i = 0; i < length; i++){
            	if(i < length - 1){
                	System.out.printf("%d, ", arr[i]);
                }else{
                	System.out.print(arr[i]);
                }
            }
            System.out.print(") ");
        }else{
        	for(int i = start; i <= end; i++){
                arr[index] = i;
                printCombinations(arr, index + 1, i, end);
            }
        }
	}
	
//	Напишете програма, която генерира и отпечатва всички комбинации с
//	повторение на k елемента над n-елементно множество.
//	Примерен вход:
//	n = 3
//	к = 2
//	Примерен изход:
//	(1 1), (1 2), (1 3), (2 2), (2 3), (3 3)

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N = ");
		int n = scan.nextInt();
		
		System.out.println("K = ");
		int k = scan.nextInt();
		
		int[] arr = new int[k];
		printCombinations(arr, 0, 1, n);
		
		scan.close();
	}
}
