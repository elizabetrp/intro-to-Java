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
				digitName = "����";
				break;
			case 1:
				digitName = "����";
				break;
			case 2:
				digitName = "���";
				break;
			case 3:
				digitName = "���";
				break;
			case 4:
				digitName = "������";
				break;
			case 5:
				digitName = "���";
				break;
			case 6:
				digitName = "����";
				break;
			case 7:
				digitName = "�����";
				break;
			case 8:
				digitName = "����";
				break;
			case 9:
				digitName = "�����";
				break;
			default:
				digitName = "Oops! This is not a digit. Refresh and enter a digit.";
				break;
		}
		System.out.println(digitName);
		
		scan.close();
	}
}
