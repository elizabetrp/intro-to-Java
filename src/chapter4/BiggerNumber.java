package chapter4;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double a = scan.nextDouble();
		
		System.out.println("Enter first number: ");
		double b = scan.nextDouble();
		
		double c = a - b;
		
		String pattern = c > 0 ? a + " is greater than " + b  + ".": c == 0 ? "blabla" : b + " is greater than " + a + ".";
		System.out.println(pattern);
		scan.close();
	}
}
