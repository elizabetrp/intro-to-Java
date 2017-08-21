package chapter123;

import java.util.Scanner;

public class Trapezium {
	public static void main(String[] args) {
		float a, b, h;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter side a: ");
		a = scan.nextFloat();
		
		System.out.print("Please enter side b: ");
		b = scan.nextFloat();
		
		System.out.print("Please enter height: ");
		h = scan.nextFloat();
		
		float area = (a + b) / 2 * h;
		
		System.out.println("The area of this trapezium is " + area + ".");
		
		scan.close();
	}
}
