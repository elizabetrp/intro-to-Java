package chapter7;

import java.util.Arrays;

/**
 * Напишете програма, която намира максималната редица от еднакви
 * елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} -> {2, 2, 2}
 */
public class MaxEqualElements {

	public static void main(String[] args){
		// I changed it
		int[] numbers = {1, 2, 2, 3, 4, 5, 2, 2, 2, 2};
        int length = numbers.length;
        int max = 0;
        int count = 0;
        int[] temp = new int[length];

        for (int i = 0; i < length - 1; i++){
        	//This breaks the program when the repeatable symbol is in the end of the array (execute it)
            // I think you don't need if and while here
        	if(numbers[i] == numbers[i + 1]){
        		count = 1;
        		while(numbers[i] == numbers[i + 1]){
        			i++;
        			count++;
        		}
        		if(count > max){
        			max = count;
        			while(count != 0){
        			    //Try without showing leading 0-s
        				temp[count--] = numbers[i];
        			}
        		}
        	}
        }

        System.out.println(Arrays.toString(temp));
	}
}
