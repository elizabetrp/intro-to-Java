package chapter13;

public class WordOrder {
	public static void reverseWords(String sentence){
		String[] words = sentence.split("[ .,]+");
		String newSentence = "";
		for(int i = words.length - 1; i >= 0; i--){
			newSentence += words[i] + " ";
		}
		
		System.out.println(newSentence);
	}
	
	public static void main(String[] args){
		reverseWords("C# is not C++ and PHP is not Delphi.");
	}
}
