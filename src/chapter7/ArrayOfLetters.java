package chapter7;

import java.util.Scanner;

public class ArrayOfLetters {
//	Да се напише програма, която създава масив с всички букви от
//	латинската азбука. Да се даде възможност на потребител да въвежда
//	дума от конзолата и в резултат да се извеждат индексите на буквите от
//	думата.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter some word: ");
		String word = scan.nextLine();
		
		System.out.println("The indexes of the letters are as follows:");
		
		int a = 'a';
		
		for(int i = 0; i < word.length(); i++){
			int position = (int) word.charAt(i) - a;
			char letter = word.charAt(i);
			System.out.printf("%s -> %d%n", letter, position);
		}
		
		scan.close();
	}
}
