package chapter5;

import java.util.Scanner;

public class QuadraticEquation {
	static double a, b, c, discriminant, root1, root2;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter coefficients a, b and c on separate lines:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		double denominator = 2*a;
		
		discriminant = Math.pow(b, 2) - 2*denominator*c;
		
		if(discriminant > 0){
			root1 = (-b + Math.pow(discriminant, 1/2))*(1/denominator);
			root2 = (-b - Math.pow(discriminant, 1/2))*(1/denominator);
			System.out.printf("The roots are: %f and %f.", root1, root2);
		}
		if(discriminant == 0){
			root1 = root2 = -b*(1/denominator);
			System.out.printf("There is one double root: %f.", root1);
		}
		if(discriminant < 0){
			System.out.println("There are no real roots.");
		}
		
		scan.close();
	}
}
