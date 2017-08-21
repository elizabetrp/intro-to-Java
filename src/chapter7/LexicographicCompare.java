package chapter7;

public class LexicographicCompare {
//	Да се напише програма, която сравнява два масива от тип char
//	лексикографски (буква по буква) и проверява кой от двата е по-рано в
//	лексикографската подредба.
	public static void main(String[] args){
		char[] one = {'z', 'a', 'k'};
		char[] two = {'z', 'a', 'f'};
		
		boolean compare = true;
		
		for(int i = 0; i < one.length; i++){
			if((int) one[i] > (int) two[i]){
				compare = false;
			}
		}
		
		System.out.println("The first array comes earlier than the second one? " + compare);
	}
}
