package chapter6;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){	
		int count;

		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.print("How many numbers (between 1 and 206) do you want to be summed up? ");
			count = scan.nextInt();
		}while(count < 1 || count > 206);		
		
		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		long tempSum = n1 + n2;
		
		if(count == 1){
			System.out.println(0);
		}else if(count == 2) {
			System.out.println(tempSum);
		}else {
			long result = 0;
			for(int i = 2; i < count; ++i){
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				result = tempSum + n3 + n3;
			}
			System.out.printf("The sum of the first %d Fibonacci numbers is %d.", count, result);
		}
		
		scan.close();
	}
}
