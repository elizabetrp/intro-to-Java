package chapter7;

import java.util.Arrays;

public class MaxEqualElements {
//	Ќапишете програма, ко€то намира максималната редица от еднакви
//	елементи в масив. ѕример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} -> {2, 2, 2}.
	
	public static void main(String[] args){
		int[] numbers = {1, 2, 2, 3, 4, 5, 2, 2, 2, 1};
        int length = numbers.length;
        int max = 0;
        int count = 0;
        int[] temp = new int[length];
        
        for (int i = 0; i < length - 1; i++){
        	if(numbers[i] == numbers[i + 1]){
        		count = 1;
        		while(numbers[i] == numbers[i + 1]){
        			i++;
        			count++;
        		}
        		if(count > max){
        			max = count;
        			while(count != 0){
        				temp[count--] = numbers[i];
        			}
        		}
        	}
        }

        System.out.println(Arrays.toString(temp));
	}
}
