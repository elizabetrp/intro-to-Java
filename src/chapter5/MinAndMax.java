package chapter5;

import java.util.Scanner;;

public class MinAndMax {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double smallest = 0;
		double biggest = 0;
		double number = 0;

		for (int i = 1; i <= 10; i++) {
		   System.out.print("Enter a number: ");
		   number = scan.nextDouble();

		   if (number < smallest || i == 1) {
		       smallest = number;
		   }
		   if (number > biggest || i == 1) {
		       biggest = number;
		   }
		   System.out.printf("The smallest number is %f.%nThe biggest number is %f.%n", smallest, biggest);
		}
		scan.close();
	}
}
