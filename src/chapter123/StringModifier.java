package chapter123;

import java.util.ArrayList;
import java.util.Scanner;

public class StringModifier {
	
	static ArrayList<Integer> myArray = new ArrayList<Integer>();
	static int myInt;
	static int sum = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int length;
		do{
			System.out.print("Enter a 4-digit number: ");
			myInt = scan.nextInt();
			length = (int) Math.log10(myInt) + 1;
		}while(length != 4);
		
		for(int i = 0; i <= 3; i++){
			int backwordsDigits;
			int digit = myInt % 10;
			myInt = myInt / 10;
			myArray.add(digit);
			sum += myArray.get(i);
			backwordsDigits = myArray.get(i);
			System.out.print(backwordsDigits);
			int lastElement = myArray.get(myArray.size() - 1);
			int firstElement = myArray.get(0);
			lastElement = firstElement;
			firstElement = lastElement;
		}
		
		System.out.printf("%n", sum);
			
		scan.close();
	}
}
