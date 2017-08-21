//Print matrix with equal right diagonals.
package chapter6;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("N = ");
			n = scan.nextInt();
		}while(n >= 20 || n < 0);
		
		for (int row = 1; row <= n; row++){
			for(int col = row; col < row + n; col++){
				System.out.printf("%d ", col);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
