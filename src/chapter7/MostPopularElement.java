package chapter7;

public class MostPopularElement {
//	Напишете програма, която намира най-често срещания елемент в масив.
//	Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} -> 4 (5 пъти).
	public static void main(String[] args){
		
		int[] numbers = {1, 3, 1, 3, 3, 4, 2, 3, 2, 2, 3};
        int length = numbers.length;
		int popular = numbers[0];
		int count = 1, tempCount = 0;
		int temp = 0;
		
		for (int i = 0; i < length - 1; i++){
		    temp = numbers[i];
		    tempCount = 0;
		    for (int j = 1; j < length; j++){
		      if (temp == numbers[j]){
		        tempCount++;
		      }
		    }
		    if (tempCount > count){
		      popular = temp;
		      count = tempCount;
		    }
		}
		
	  System.out.printf("%d -> %d times", popular, count);
	}
}
