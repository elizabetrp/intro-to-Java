package chapter123;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		double x, y, squareC, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x coordinate: ");
		x = sc.nextDouble();
		
		System.out.print("Enter y coordinate: ");
		y = sc.nextDouble();
		
		squareC = (x*x + y*y);
		c = (double) Math.pow(squareC, 0.5);
		
		if(c <= 5){
			System.out.println("This point is in the circle K((0, 0), 5). c = " + c + ", squareC = " + squareC);
		}
		else {
			System.out.println("This point is not in the circle K((0, 0), 5). c = " + c + ", squareC = " + squareC);
		}
		
		if((x >= -1 && x <= 5) && (y >= 1 && y <= 5)){
			System.out.println("This point is in the rectangle.");
		}
		else {
			System.out.println("This point is not in the rectangle.");
		}
		
		sc.close();
	}
}
