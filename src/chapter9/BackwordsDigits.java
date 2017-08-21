package chapter9;

public class BackwordsDigits {
	public static void convertDigits(int number){
		
		if(number == 0){
			System.out.println(number);
		}
		
		if(number < 0){
			number += 2 * (-number);
			System.out.print("-");
			while(number > 0){
				int digit = number % 10;
				System.out.print(digit);
				number /= 10;
			}
		}
		
		while(number > 0){
			int digit = number % 10;
			System.out.print(digit);
			number /= 10;
		}
	}
	
//	Напишете метод, който отпечатва цифрите на дадено десетично число
//	в обратен ред. Например 256, трябва да бъде отпечатано като 652.
	
	public static void main(String[] args){
		convertDigits(965874854);
	}
}
