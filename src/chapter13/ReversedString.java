package chapter13;

public class ReversedString {
	public static String reverseString(String word){
		StringBuilder sb = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--){
			char c = word.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String reversedWord = reverseString("introduction");
		System.out.println(reversedWord);
	}
}
