package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Напишете метод, който приема като параметър име на текстов файл, 
//прочита съдържанието му и го връща като String.

public class Task8 {
	public static String getFileContent(String file) throws IOException{
		
		Scanner scan = new Scanner(new File(file));
		String line = "";
		
		while(scan.hasNextLine()){
			line = scan.nextLine();
			System.out.println(line);
		}

		scan.close();
		
		return line;
	}
	
	public static void main(String[] args) {
		try {
			getFileContent("C://Users//elizabet.pavlova//Desktop//test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
