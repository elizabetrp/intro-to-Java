package chapter6;

import java.util.Scanner;

public class CatalansNumbers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		do {
			System.out.println("N = ");
			number = scan.nextInt();
		}while(number < 0);
		
		long numerator = 1;
		long denominator = 1;
		
		for (int i = number * 2; i > number; i--){
			numerator *= i;
		}
		for (int j = 1; j <= number + 1; j++){
			denominator *= j;
		}

		double formula = numerator / denominator;
		System.out.printf("C%d = %f", number, formula);
		
		scan.close();
	}
}
