package chapter12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
//	public static void readFile(String fileName) throws FileNotFoundException, IOException {
//		FileInputStream fis = null;
//		fis = new FileInputStream(fileName);
//		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
//		String tmp = null;
//		while ((tmp = in.readLine()) != null) {
//			System.out.println(tmp);
//		}
//		in.close();
//		fis.close();
//	}
	public static void main(String... args) throws IOException {
		try{
			throw new IOException();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
