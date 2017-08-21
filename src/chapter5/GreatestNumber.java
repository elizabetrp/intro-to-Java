package chapter5;

import java.util.Scanner;

public class GreatestNumber {
	static double a, b, c;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter three numbers on separate lines:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if(a > b){
			if(a > c){
				System.out.println(a);
			}
			if(c > a){
				System.out.println(c);
			}
		}
		if(b > a){
			if(b > c){
				System.out.println(b);
			}
			if(c > b){
				System.out.println(c);
			}
			if(b == c){
				System.out.println(b);
			}
		}
		if(a == b && b == c){
			System.out.println("The numbers are equal.");
		}else{
			if(a == b && a > c){
				System.out.println(a);
			}
			if(a == b && c > a){
				System.out.println(c);
			}
		}
		
		scan.close();
	}
}
