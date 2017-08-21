package chapter6;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
	static int answer;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("N = ");
		
		int n = scan.nextInt();
		
		for(int i = 0; i < 50; i++){
		    answer = rand.nextInt(n);
		}

	    System.out.println(answer);
		
		scan.close();
	}
}
