package chapter6;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N = ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++){
			if(i % 3 != 0 && i % 7 != 0){
				System.out.printf("%d ", i);
			}
			
		}
		
		scan.close();
	}
}
