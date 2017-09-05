package chapter7;

import java.util.Arrays;

/**
 * Сортиране на масив означава да подредим елементите му в нарастващ (намаляващ) ред.
 * Напишете програма, която сортира масив. Да се използва алгоритъма "Selection sort".
 */
public class SelectionSort {
	//Extract in method
	public static void sort(int array[]){
		for (int i = 0; i < array.length - 1; i++){
        	int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){ 
                    index = j;
                }
            }
            int smallerNumber = array[index];  
            array[index] = array[i];
            array[i] = smallerNumber;
        }
	}
	
	public static void main(String[] args){
		int[] array = {10, 34, 2, 56, 7, 67, 88, 42};

		sort(array);
		
		System.out.println(Arrays.toString(array));
	}
}
