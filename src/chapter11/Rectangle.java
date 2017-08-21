package chapter11;

import java.util.Scanner;

public class Rectangle {
	private static double cathetus(double a, double b){
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		return sum;
	}
	
	private static double hypothenuse(double a, double b){
		double hypothenuse = Math.sqrt(cathetus(a, b));
		return hypothenuse;
	}
	
//	Напишете програма, която по дадени два катета намира хипотенузата
//	на правоъгълен триъгълник. Реализирайте въвеждане на дължините на
//	катетите от стандартния вход, а за пресмятането на хипотенузата
//	използвайте методи на класа Math.
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b;
		do{
			System.out.println("a = ");
			a = scan.nextDouble();
		}while(a <= 0);
		
		do{
			System.out.println("b = ");
			b = scan.nextDouble();
		}while(b <= 0);
		
		scan.close();
		
		System.out.printf("c = %fcm", hypothenuse(a, b));
	}
}
