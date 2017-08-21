package chapter4;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int counter = 1;
		int sum = 0;
		
		do{
			System.out.println("Please enter a number: ");
			int a = scan.nextInt();
			sum += a;
			counter++;
		}while(counter < 4);
		
		System.out.printf("The sum of these numbers is %d.", sum);
		
		scan.close();
	}
}
