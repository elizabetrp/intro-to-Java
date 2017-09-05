package chapter13;

import java.util.Arrays;

public class Split {
	public static void splitText(String text){
		String[] splittedText = text.split("[\\\\]+");
		System.out.println(Arrays.toString(splittedText));
	}
	
	public static void main(String[] args){
		splitText("Колко\\обратни\\наклонени\\черти\\трябва\\да\\посочите\\като\\аргумент");
	}
}
