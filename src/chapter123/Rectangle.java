package chapter123;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		int area = a*b;
		int perimeter = 2*(a + b);
		
		System.out.println("Area: " + area + ", Perimeter: " + perimeter);
		
		sc.close();
	}	
}
