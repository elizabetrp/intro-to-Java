package chapter10;

import java.util.Scanner;

public class Variations {
	public static void printVariations(int n, int k){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(i == n && j == n){
					System.out.printf("(%d, %d)", i, j);
				}else{
					System.out.printf("(%d, %d), ", i, j);
				}
			}
		}
	}
	
//	Напишете програма, която генерира всички вариации с повторение на n
//	елемента от k-ти клас.
//	Примерен вход:
//	n = 3
//	к = 2
//	Примерен изход:
//	(1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N = ");
		int n = scan.nextInt();
		
		System.out.println("K = ");
		int k = scan.nextInt();
		
		printVariations(n, k);
		
		scan.close();
	}
}
