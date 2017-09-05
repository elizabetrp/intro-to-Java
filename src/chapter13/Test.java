package chapter13;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		String score = "sCore /hah";
		String scary = "scary";
		System.out.println(score.compareToIgnoreCase(scary)); // 14
		System.out.println(scary.compareToIgnoreCase(score)); // -14
		System.out.println(scary.compareTo(score)); // 32
		
		String str1 = new String("Hello");
		String str2 = str1;
		System.out.println((str1==str2));

		System.out.println(Arrays.toString(score.split("[a-z]+")));
		String small = "[a-z]";
		System.out.println(small += "bla");
		System.out.println(small);
		
		try{
			String text = "53";
			int intValue = Integer.parseInt(text);
			System.out.println(intValue);
		} catch (NumberFormatException n){
			throw new NumberFormatException();
		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String userInput = "22.14.2008";
		try {
			Date date = sdf.parse(userInput);
			System.out.println(date);
		} catch (ParseException pe) {
			System.out.println("Error in parsing " + userInput);
		}
		
		String pattern = "EEEE, dd.MM.yyyy г.";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		Date dateNow = new Date();
		System.out.println(dateNow);
		String formattedDate = sdf1.format(dateNow);
		System.out.println(formattedDate); 

	}
}
