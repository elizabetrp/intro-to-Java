//Count zeros at the end of factorial.
package chapter6;

import java.util.Scanner;

public class CountZeros {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("N = ");
			n = scan.nextInt();
		}while(n < 0);
		
		long fact = 1;
		
		for (int i = n; i >= 1; i--){
			fact *= i;
		}
		
		int byFive = n / 5;
		
		System.out.printf("N! = %d -> Number of zeros: %d", fact, byFive);
		
		scan.close();
	}
}
