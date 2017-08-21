package chapter5;

import java.util.Scanner;

public class BonusPoints {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		do{
			System.out.print("Enter a number between 0 and 9: ");
			input = scan.nextInt();
		}while(input < 0 || input > 9);
		
		int inputTen = input * 10;
		int inputHundred = input * 100;
		int inputThousand = input * 1000;
		
		switch(input){
		case 1:
			System.out.println(inputTen);
			break;
		case 2:
			System.out.println(inputTen);
			break;
		case 3:
			System.out.println(inputTen);
			break;
		case 4:
			System.out.println(inputHundred);
			break;
		case 5:
			System.out.println(inputHundred);
			break;
		case 6:
			System.out.println(inputHundred);
			break;
		case 7:
			System.out.println(inputThousand);
			break;
		case 8:
			System.out.println(inputThousand);
			break;
		case 9:
			System.out.println(inputThousand);
			break;
		default:
			System.out.println("The number does not belong in the interval.");
		}
		
		scan.close();
	}
}
