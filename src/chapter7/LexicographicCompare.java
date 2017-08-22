package chapter7;


/**
 * LexicographicCompare.java Да се напише програма, която сравнява два масива от тип char лексикографски (буква по буква)
 * и проверява кой от двата е по-рано в лексикографската подредба.
 */
public class LexicographicCompare {

	public static void main(String[] args){
		char[] one = {'z', 'a', 'k'};
		char[] two = {'z', 'a', 'f'};
		
		boolean compare = true;
		
		for(int i = 0; i < one.length; i++){
			// no need to cast them to int
			if((int) one[i] > (int) two[i]){
				//You can print the result here and terminate the program.
				//If not terminated in the end you can say for sure that the
				// second one is bigger that the first one and you will not need the compare variable
				compare = false;
			}
		}

		System.out.println("The first array comes earlier than the second one? " + compare);
	}
}
