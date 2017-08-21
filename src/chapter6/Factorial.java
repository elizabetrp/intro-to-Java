package chapter6;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long n;
		long k;
		
		do{
			System.out.print("N = ");
			n = scan.nextLong();
		}while(n < 1);
		
		do{
			System.out.print("Enter K (<= N): ");
			k = scan.nextLong();
		}while(k > n);
		
		if(n >= k){
			long result = 1;
			long temp;
			for(int i = 1; i <= (n - k); i++){
				temp = k + i;
				result = temp * result;
			}
			System.out.printf("N!/K! = %d", result);
		}else {
			System.out.println("K must be smaller than N. Please refresh and enter again.");
		}
		
		scan.close();
	}
}