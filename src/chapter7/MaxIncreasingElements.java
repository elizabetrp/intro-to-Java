package chapter7;

import java.util.Arrays;

/**
 * Напишете програма, която намира максималната редица от нарастващи елементи в масив.
 * Пример: {3, 2, 3, 4, 2, 2, 4} -> {2, 3, 4}.
 */
public class MaxIncreasingElements {
	public static void main(String[] args){
		//I changed this
		int[] numbers = {3, 2, 3, 4, 5, 4, 3, 4, 5, 6, 7, 8, 1, 4, 5, 6, 7, 8};
        int length = numbers.length;
        int count = 0;
        int[] temp = new int[length];
        
        for (int i = 0; i < length - 1; i++){
        	//Again logic broken when the result is in the end
			//You can combine if and while here
        	if(numbers[i + 1] - numbers[i] == 1){
        		count = 1;
        		while(numbers[i + 1] - numbers[i] == 1){
        			temp[count] = numbers[i];
        			temp[count + 1] = numbers[i + 1];
        			count++;
        			i++;
        		}        		
        	}
        }

        System.out.println(Arrays.toString(temp));
	}
}
