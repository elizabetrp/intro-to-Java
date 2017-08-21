package chapter4;

import java.util.Scanner;

public class Radius {
	static double c;
	static double s;
	static float radius;
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		radius = reader.nextFloat();
		
		s = Math.PI * Math.pow(radius, 2);
		c = 2 * s / radius;
		
		System.out.printf("The area of this circle is: %f.%nThe perimeter of this circle is: %f.", s, c);
		
		reader.close();
	}
}
