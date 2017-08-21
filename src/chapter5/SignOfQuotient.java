package chapter5;

import java.util.Scanner;

public class SignOfQuotient {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers on separate lines:");
		double first = scan.nextDouble();
		double second = scan.nextDouble();
		
		if((first > 0 && second > 0) || (first < 0 && second < 0)){
			System.out.println("The sign of their quotient is \"+\"");
		}else if((first > 0 && second < 0) || (first < 0 && second > 0)){
			System.out.println("The sign of their quotient is \"-\"");
		}else if(second == 0){
			System.out.println("Cannot divide by 0. Please refresh and enter a non-zero value for the second number.");
		}else{
			System.out.println("0");
		}
		
		scan.close();
	}
}