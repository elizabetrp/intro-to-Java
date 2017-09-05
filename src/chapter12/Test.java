package chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    private static String filepath = "C:\\Users\\elizabet.pavlova\\Desktop\\binary_tes.bin";
	public static void main(String[] args) {
        BufferedReader br = null;
        String curLine;
        
        try {
            br = new BufferedReader(new FileReader(filepath));
            while ((curLine = br.readLine()) != null) {
                System.out.println(curLine);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        } finally{
        	try {
        		if(br != null){
        			br.close();
        		}
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        }
    }
}
