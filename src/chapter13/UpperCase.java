package chapter13;

public class UpperCase {
	public static void convertToUpperCase(String text){
		String upperText = text.toUpperCase();
		String newText = text.replace("((<upcase>).{1,}(</upcase>))+", "$2".toUpperCase());
//		String[] splittedText = text.split("[., \n><]+");
//		System.out.println(Arrays.toString(splittedText));
		
		int index = text.indexOf("<");
		int index2 = text.indexOf(">");
		String sub = text.substring(index, index2 + 1);
		int index3 = index + 1;
		while(index3 < index2){
			index3++;
		}
		
//		System.out.println(index);
//		String sub = text.substring(index, index + "upcase".length() + 2);
//		System.out.println(sub);
//		System.out.println(upperText);
		System.out.println(newText);
	}
	
	public static void main(String[] args){
		String text = "We are living in a <upcase>yellow submarine</upcase>. We don't "
				+ "have <upcase>anything</upcase> else.";
		convertToUpperCase(text);
	}
}
