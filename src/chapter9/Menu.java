package chapter9;

import java.util.Scanner;

public class Menu {
	
//	Напишете програма, която решава следните задачи:
//		- Обръща последователността на цифрите на едно число.
//		- Пресмята средното аритметично на дадена редица.
//		- Решава линейното уравнение a * x + b = 0.
//	Създайте подходящи методи за всяка една от задачите.
//	Напишете програмата така, че на потребителя да му бъде изведено
//	текстово меню, от което да избира коя задача да решава.
//	Направете проверка на входните данни:
//		- Десетичното число трябва да е неотрицателно.
//		- Редицата не трябва да е празна.
//		- Коефициентът a не трябва да е 0.
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		System.out.println("Choose an option:");
		System.out.println("1 - Reversal, 2 - Mean, 3 - Equation");
		
		int choice = input.nextInt();
		input.close();
		
		switch(choice){
			case 1:
				System.out.println("Reversal");
				int number;
				
				do{
					System.out.println("Enter a number: ");
					number = input.nextInt();
				}while(number < 0);
				
				BackwordsDigits.convertDigits(number);
				break;
			case 2:
				getMean();		
				break;
			case 3:
				solveLinearEquation();
				break;
			default:
				System.out.println("Invalid option!");
				break;
		}
	}
	public static void getMean(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mean");
		int length;
		
		do{
			System.out.print("How many numbers would you like to have? ");
			length = input.nextInt();
		}while(length <= 0);
		
		int[] array = new int[length];
		
		for(int i = 0; i < length; i++){
			System.out.printf("array[%d] = ", i);
			array[i] = input.nextInt();
		}
		
		double sum = 0;
		
		for(int i = 0; i < length; i++){
			sum += array[i];
		}
		
		double mean = sum / length;
		System.out.printf("The mean is: %f", mean);
		
		input.close();
	}
	
	public static void solveLinearEquation(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Equation");
		double a;
		
		do{
			System.out.print("a = " + "\n");
			a = input.nextDouble();
		}while(a == 0);
		
		System.out.print("b = " + "\n");
		double b = input.nextDouble();
		
		double x = -b / a;
		System.out.printf("x = %f", x);
		
		input.close();
	}
}
