package chapter7;

import java.util.Scanner;

public class SumOfSequence {
//	Да се напише програма, която намира последователност от числа в
//	масив, които имат сума равна на число, въведено от конзолата (ако има
//	такава). Пример: {4, 3, 1, 4, 2, 5, 8}, S=11 -> {4, 2, 5}.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s;
		
		do{
			System.out.println("S = ");
			s = scan.nextInt();
		}while(s < 0);
		
		int[] array =  {5, 3, 2, 4, 2, 5, 8};
		int length = array.length;
		int sum = 0;
		int i, j = 0;
		
		for(i = 0; i < length; i++){
			sum = 0;
			sum += array[i];
			for(j = i + 1; j <= length; j++){
				if(sum == s){
					System.out.printf("Found sum equal to %d between indexes %d and %d.", s, i, j - 1);
				}
				if(sum > s || j == length){
					continue;
				}
				sum += array[j];
			}
		}
		
		scan.close();
	}
}
