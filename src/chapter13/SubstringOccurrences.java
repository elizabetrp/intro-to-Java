package chapter13;

public class SubstringOccurrences {
	public static int getOccurrences(String text, String substring){
		int count = 0;
		int index = text.indexOf(substring);
		while (index != -1) {
			index = text.indexOf(substring, index + 1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. So we are drinking all the "
				+ "day. We will move out of it in 5 days.";
		String sub = "in";
		
		System.out.printf("Found substring \"in\" in the text %d times.", getOccurrences(text, sub));
	}
}
