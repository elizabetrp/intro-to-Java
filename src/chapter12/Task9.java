package chapter12;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;

//Напишете метод, който приема като параметър име на бинарен файл и
//прочита съдържанието на файла и го връща като масив от байтове.
//Напишете метод, който записва прочетеното съдържание в друг файл.

public class Task9 {
	public static void readBinary(String file) throws IOException {
		
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int offset = 0;
		byte[] buffer = new byte[25];
		int count = 1;
		
		try {
			while((fis.read(buffer, offset, count)) != -1) {
				baos.write(buffer, offset, count);
				offset++;
			}
		} finally {
			if(fis != null) {
				fis.close();
			}
			
			if(baos != null) {
				baos.close();
			}
		}
		System.out.println(Arrays.toString(buffer));
		//System.out.println(Arrays.toString(Files.readAllBytes(Paths.get(file))));
	}
	
	public static void main(String[] args) throws IOException {
		readBinary("C:\\Users\\elizabet.pavlova\\Desktop\\CharacterStats.bin");
	}
}
