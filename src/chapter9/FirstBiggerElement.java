package chapter9;

public class FirstBiggerElement {
	
	public static int getPosition(int... array){
		int position = 0;
		for(int i = 1; i < array.length - 1; i++){
			if(array[i] > array[i - 1] && array[i] > array[i + 1]){
				position = i;
				break;
			}else{
				position = -1;
			}
		}
		return position;
	}
	
//	Напишете метод, който връща позицията на първия елемент на масив,
//	който е по-голям от двата свои съседи едновременно, или -1, ако няма
//	такъв елемент.

	
	public static void main(String[] args) {
		int position = getPosition(1, 1, 5, 2, 2, 6, 3);
		System.out.println(position);
	}

}
