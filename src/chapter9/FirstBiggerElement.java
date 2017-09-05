package chapter9;

//	Напишете метод, който връща позицията на първия елемент на масив,
//	който е по-голям от двата свои съседи едновременно, или -1, ако няма
//	такъв елемент.
public class FirstBiggerElement {

    //You shouldn't use varargs when you know you need an array
	public static int getPosition(int... array){
		int position = 0;
		for(int i = 1; i < array.length - 1; i++){
			if(array[i] > array[i - 1] && array[i] > array[i + 1]){
			    // you can do 'return i'
				position = i;
				break;
			}//remove the else
			else{
				position = -1;
			}
		}
		//return -1, no need of position variable
		return position;
	}

	public static void main(String[] args) {
	    //This should return -1
		int position = getPosition();
		System.out.println(position);
	}

}
