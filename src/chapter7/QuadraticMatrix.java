package chapter7;

import java.util.Scanner;

public class QuadraticMatrix {
//	Напишете програма, която създава следните квадратни матрици и ги
//	извежда на конзолата във форматиран вид. Размерът на матриците се
//	въвежда от конзолата.
	
//	unfinished
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("N = ");
			n = scan.nextInt();
		}while(n <= 0);
		
		int sqrtN = n * n;
		
		//Matrix 1
		System.out.println("Matrix 1\n");
		
		for (int row = 1; row <= n; row++){
			for(int col = row; col <= sqrtN; col+=n){
				System.out.printf("%d ", col);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Matrix 2
		System.out.println("Matrix 2\n");
		int[][] array = new int[n][n];
		
		for (int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				if(row == 0){
					if(col % 2 != 0){
						array[row][col] = (col + 1) * n;
					}else{
						array[row][col] = col * n + 1;
					}
				}else{
					if(col % 2 != 0){
						array[row][col] = array[row - 1][col] - 1;
					}else{
						array[row][col] = array[row - 1][col] + 1;
					}
				}
				System.out.printf("%d ", array[row][col]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Matrix 3
		System.out.println("Matrix 3\n");
		int arr[][] = new int[n][n];
		int firstElement = arr[n - 1][0] = 1;
		int lastWrittenElement = firstElement;
		
		for(int row = 0; row < n; row++){
			for(int col = 0, m = 7; col <= row; col++, m++){
				int k = row - col;
				arr[k][col] = m;
				System.out.print(arr[k][col] + " " );
				if(row == n - 1 && col == 0){
					arr[row][col] = firstElement;
				}
				if(row == n - 2 && col == 0){
					arr[row][col] = lastWrittenElement + firstElement;
					lastWrittenElement = arr[row][col];
				}
				if(row == n - 1 && col == 1){
					arr[row][col] = lastWrittenElement + firstElement;
					lastWrittenElement = arr[row][col];
				}
				if(row == n - 3 && col == 0){
					arr[row][col] = lastWrittenElement + firstElement;
					lastWrittenElement = arr[row][col];
				}
				System.out.printf("%d ", arr[row][col]);
			}
			
			System.out.println();
		}
		for( int row = n - 2; row >= 0; row-- ) {
	        for( int col = 0, m = 1; col <= row; col++, m++) {
	            int k = row - col;
	            arr[k][col] = m;
	            System.out.print(arr[n - col - 1][n - k - 1] + " ");
	        }
	        System.out.println();
	    }
		
		for( int row = 0; row < n * n; row++ ) {
	        for( int col = 0, m = 1; col <= row; col++, m++) {
	            int k = row - col;
	            if( k < n && col < n ) {
	            	arr[k][col] = m;
	                System.out.print( arr[k][col] + " " );
	            }
	        }
		}
//		System.out.println(lastWrittenElement);
//		System.out.println(firstElement);
		
		scan.close();
	}
}
