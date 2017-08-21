package chapter4;

import java.util.Scanner;

public class BiggestNumber {
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
		
		if(a > b && a > c && a > d && a > e){
			System.out.println("The biggest number is " + a + ".");
		}else if(b > a && b > c && b > d && b > e){
			System.out.println("The biggest number is " + b + ".");
		}else if(c > a && c > b && c > d && c > e){
			System.out.println("The biggest number is " + c + ".");
		}else if(d > a && d > b && d > c && d > e){
			System.out.println("The biggest number is " + d + ".");
		}else{
			System.out.println("The biggest number is " + e + ".");
		}
		
		scan.close();
	}
}
