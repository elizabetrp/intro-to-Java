package chapter4;

import java.util.Scanner;

public class SumOfFive {
	static double a, b, c, d, e;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		a = scan.nextDouble();
		
		System.out.println("Please enter the second number: ");
		b = scan.nextDouble();
		
		System.out.println("Please enter the third number: ");
		c = scan.nextDouble();
		
		System.out.println("Please enter the fourth number: ");
		d = scan.nextDouble();
		
		System.out.println("Please enter the fifth number: ");
		e = scan.nextDouble();
		
		System.out.printf("The sum of these numbers is %f.", a + b + c + d + e);
		
		scan.close();
	}
}
