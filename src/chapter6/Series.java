//Series of fractions. 
package chapter6;

import java.util.Scanner;

public class Series {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		double total = 1;
		
		do{
			System.out.println("N = ");
			n = scan.nextInt();
		}while(n < 0);
		
		if(n != 0){
			System.out.print("x = ");
			int x = scan.nextInt();
		
			long factI = 1;
			for (int i = 1; i <= n; i++){
				factI *= i;
				double fraction = factI / Math.pow(x, i);
				total += fraction;
			}
		}
		
		System.out.println(total);
		
		scan.close();
	}
}
