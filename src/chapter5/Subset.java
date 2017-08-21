package chapter5;

import java.util.Scanner;

public class Subset {
	static double a, b, c;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers on separate lines:");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		int sum = 0;
		
		if(a == 0 && b == 0 && c == 0){
			sum+=2;
		}else if(a + b == 0){
			sum++;
		}else if(a + c == 0){
			sum++;
		}else if(b + c == 0){
			sum++;
		}
		System.out.printf("The number of couples whose sum is 0 is: %d.", sum);
		
		scan.close();
	}
}
