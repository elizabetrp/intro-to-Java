package chapter12;

import java.io.*;

//Потърсете информация в Интернет и дефинирайте собствен клас за
//изключение FileParseException. Вашето изключение трябва да съдържа 
//382 Въведение в програмирането с Java
//в себе си името на файл, който се обработва и номер на ред, в който
//възниква изключението. Добавете подходящи конструктори за вашето
//изключение. Напишете програма, която чете от текстов файл числа. Ако
//при четенето се стигне до ред, който не съдържа число, хвърлете вашия
//exception и го обработете в извикващия метод.

public class FileParseException extends Exception {
	private String fileName;
	private int line;
	
	public FileParseException() {
		
	}
	
	public FileParseException(String fileName){
		this.fileName = fileName;
	}
	
	public int getLine(){
		return line;
	}
}
