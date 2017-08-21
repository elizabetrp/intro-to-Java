package chapter6;

import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long n, k;
		
		do{
			System.out.print("N = ");
			n = scan.nextLong();
		}while(n < 1);
		
		do{
			System.out.print("Enter K (<= N): ");
			k = scan.nextLong();
		}while(k > n);
		
		long tempN, tempK, tempNK;
		long resultN = 1;
		long resultK = 1;
		long resultNK = 1;
		
		for(int i = 0; i < n; i++){
			tempN = n - i;
			resultN *= tempN;
		}
		
		for(int j = 0; j < k; j++){
			tempK = k - j;
			resultK *= tempK;
		}
		
		for(int m = 0; m < (n - k); m++){
			tempNK = n - k - m;
			resultNK *= tempNK;
		}
		
		long total = resultN * resultK / resultNK;
		System.out.println(total);
		
		scan.close();
	}
}
