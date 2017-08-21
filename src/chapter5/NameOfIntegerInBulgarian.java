package chapter5;

import java.util.Scanner;

public class NameOfIntegerInBulgarian {
	static int digit;
	static String digitName;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a digit (0-9):");
		digit = scan.nextInt();
		
		switch(digit){
			case 0:
				digitName = "Нула";
				break;
			case 1:
				digitName = "Едно";
				break;
			case 2:
				digitName = "Две";
				break;
			case 3:
				digitName = "Три";
				break;
			case 4:
				digitName = "Четири";
				break;
			case 5:
				digitName = "Пет";
				break;
			case 6:
				digitName = "Шест";
				break;
			case 7:
				digitName = "Седем";
				break;
			case 8:
				digitName = "Осем";
				break;
			case 9:
				digitName = "Девет";
				break;
			default:
				digitName = "Oops! This is not a digit. Refresh and enter a digit.";
				break;
		}
		System.out.println(digitName);
		
		scan.close();
	}
}
