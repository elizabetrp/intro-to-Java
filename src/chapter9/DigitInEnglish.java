package chapter9;

public class DigitInEnglish {
	public static String getDigitName(int number){
		String digitName = "";
		switch(number){
			case 0:
				digitName = "zero";
				break;
			case 1:
				digitName = "one";
				break;
			case 2:
				digitName = "two";
				break;
			case 3:
				digitName = "three";
				break;
			case 4:
				digitName = "four";
				break;
			case 5:
				digitName = "five";
				break;
			case 6:
				digitName = "six";
				break;
			case 7:
				digitName = "seven";
				break;
			case 8:
				digitName = "eight";
				break;
			case 9:
				digitName = "nine";
				break;
			default:
				digitName = "Incorrect input!";
				break;
		}
		return digitName;
	}
	
	public static String getDigit(int number){
		int lastDigit = number % 10;
		String name = getDigitName(lastDigit);
		return name;
	}
	
//	Напишете метод, който връща английското наименование на последната
//	цифра от дадено число. Примери: за числото 512 отпечатва "two"; за
//	числото 1024 – "four".
	
	public static void main(String[] args){
		System.out.println(getDigit(6841));
	}
}