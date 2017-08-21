package chapter5;

import java.util.Scanner;

public class SwitchValues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two whole numbers (on separate lines):");
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = first;
		
		if(first > second){
			first = second;
			second = third;
		}
		
		System.out.printf("The first number is %d;%nThe second number is %d.", first, second);
		
		scan.close();
	}
}
