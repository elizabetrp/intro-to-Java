package chapter9;

/**
 *  Напишете метод, който проверява дали елемент, намиращ се на дадена
 *  позиция от масив, е по-голям, или съответно по-малък от двата му съседа
 */
public class AdjacentElements {
	// why you use varargs here? this means that someone can pass you no array and position, which will result in exception
	public static String compareLeftElement(int position, int... array){
		//Just return whenever you know the result. In this case the method should be boolean and
		// if there is no left element you can warn the user
		String biggerThanLeft = "Yes";
		//What if the position is negative? or bigger that the array length
		if(position == 0){
			biggerThanLeft = "This number has no left adjacent element.";
		}else{
			if(array[position] < array[position - 1]){
				biggerThanLeft = "No";
			}
		}
		return biggerThanLeft;
	}

	//see comments above
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
	
	public static void main(String[] args){
		//Exceptions here
		String resultLeft = compareLeftElement(3);
		String resultRight = compareRightElement(45, 1, 2, 3, 4, 5);
		System.out.printf("The number is bigger than the left one: %s\n"
				+ "The number is bigger than the right one: %s", resultLeft, resultRight);
	}
}
