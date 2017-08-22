package chapter11;

import java.util.Random;

public class AdvertismentMessage {
//	Напишете програма, която генерира случайно рекламно съобщение за
//	някакъв продукт. Съобщенията трябва да се състоят от хвалебствена
//	фраза, следвани от хвалебствена случка, следвани от автор (първо и
//	второ име) и град, които се избират от предварително подготвени
//	списъци. Например, нека имаме следните списъци:
//	- Хвалебствени фрази: {"Продуктът е отличен.", "Това е страхотен
//	продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият
//	продукт от тази категория."}.
//	- Хвалебствени случки: {"Вече се чувствам добре.", "Успях да се
//	променя.", "Той направи чудо.", "Не мога да повярвам, но вече се
//	чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."}.
//	- Първо име на автор: {"Диана", "Петя", "Стела", "Елена", "Катя"}.
//	- Второ име на автор: {"Иванова", "Петрова", "Кирова"}.
//	- Градове: {"София", "Пловдив", "Варна", "Русе", "Бургас"}.
//	Тогава програма би могла да изведе следното случайно-генерирано
//	рекламно съобщение:
//	Постоянно ползвам този продукт. Опитайте и вие. Аз съм доволна. -
//	– Елена Петрова, Варна

	private static Random rand = new Random();
	
	private static String getPhrase(){
		String[] phrase = {"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.", 
				"Това е най-добрият продукт от тази категория."};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	
	private static String getEvent(){
		String[] phrase = {"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.", 
				"Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getFirstName(){
		String[] phrase = {"Диана", "Петя", "Стела", "Елена", "Катя"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getLastName(){
		String[] phrase = {"Иванова", "Петрова", "Кирова"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getCity(){
		String[] phrase = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	public static void main(String[] args){
		System.out.printf("%s %s\n%s %s, %s", getPhrase(), getEvent(), getFirstName(), getLastName(), getCity());
	}
}
