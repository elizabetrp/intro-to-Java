package chapter7;

import java.util.Arrays;

public class MaxIncreasingElements {
//	Ќапишете програма, ко€то намира максималната редица от нарастващи
//	елементи в масив. ѕример: {3, 2, 3, 4, 2, 2, 4} -> {2, 3, 4}.
	public static void main(String[] args){
		int[] numbers = {3, 2, 3, 4, 5, 4, 3, 4, 5, 6, 7, 8, 1, 4};
        int length = numbers.length;
        int count = 0;
        int[] temp = new int[length];
        
        for (int i = 0; i < length - 1; i++){
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
