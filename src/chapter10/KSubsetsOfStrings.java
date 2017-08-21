package chapter10;

import java.util.Scanner;

public class KSubsetsOfStrings {
	static String[] words;
	public static void printCombinations(int[] arr, int index, int start, int end){
		int length = arr.length;
		if(index >= length){
			System.out.print("(");
			for (int i = 0; i < length; i++){
	        	System.out.printf("%s, ", words[arr[i]]);
	        	if (i != length - 1){ 
	        		System.out.print((" "));
	        	}
			}
	        System.out.print("), ");
		}else{
			for (int i = start; i < end; i++){
				arr[index] = i;
				printCombinations(arr, index + 1, i + 1, end);
			}
		}
	}
	
//	Нека е дадено множество от символни низове. Да се напише програма,
//	която генерира всички подмножества съставено от k на брой символни
//	низа, избрани измежду елементите на това множество.
//	Примерен вход:
//	strings = {'test', 'rock', 'fun'}
//	k = 2
//	Примерен изход:
//	(test rock), (test fun), (rock fun)

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int length = scan.nextInt();
		words = new String[length];
				
		for (int i = 0; i < length; i++){
            System.out.printf("Enter %d word: ", i + 1);
            words[i] = scan.next();
        }
		
		System.out.println("K = ");
		int k = scan.nextInt();
		
		int[] arr = new int[k];
		
		printCombinations(arr, 0, 0, length);
		scan.close();
	}
}
