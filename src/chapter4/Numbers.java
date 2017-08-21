//Number of fives in the difference of two numbers.

package chapter4;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int a = scan.nextInt();
		
		System.out.println("Please enter the second number: ");
		int b = scan.nextInt();
		
		int diff = Math.abs(b - a);
		
		System.out.println(diff/5);
		
		scan.close();
	}
}
