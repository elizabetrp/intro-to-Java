package chapter9;

public class AdjacentElements {
	
	public static String compareLeftElement(int position, int... array){
		String biggerThanLeft = "Yes";
		if(position == 0){
			biggerThanLeft = "This number has no left adjacent element.";
		}else{
			if(array[position] < array[position - 1]){
				biggerThanLeft = "No";
			}
		}
		return biggerThanLeft;
	}
	
	public static String compareRightElement(int position, int... array){
		String biggerThanRight = "Yes";
		if(position != array.length - 1){
			if(array[position] < array[position + 1]){
				biggerThanRight = "No";
			}
		}else{
			biggerThanRight = "This number has no right adjacent element.";
		}
		return biggerThanRight;
	}
	
//	Напишете метод, който проверява дали елемент, намиращ се на дадена
//	позиция от масив, е по-голям, или съответно по-малък от двата му
//	съседа.
	
	public static void main(String[] args){
		String resultLeft = compareLeftElement(3, 1, 2, 3, 4, 5);
		String resultRight = compareRightElement(3, 1, 2, 3, 4, 5);
		System.out.printf("The number is bigger than the left one: %s\n"
				+ "The number is bigger than the right one: %s", resultLeft, resultRight);
	}
}
