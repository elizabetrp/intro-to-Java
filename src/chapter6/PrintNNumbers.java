//Print N numbers.
package chapter6;

import java.util.Scanner;

public class PrintNNumbers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("N = ");
			n = scan.nextInt();
		}while(n < 0);
		
		for (int i = 1; i <= n; i++){
			System.out.printf("%d ", i);
		}
		
		scan.close();
	}
}
