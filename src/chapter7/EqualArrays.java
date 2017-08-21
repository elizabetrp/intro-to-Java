//Check if two arrays are equal.
package chapter7;

import java.util.Scanner;

public class EqualArrays {
//	ƒа се напише програма, ко€то чете два масива от конзолата и провер€ва
//	дали са еднакви.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean check = false;
		
		int firstArrDimension = scan.nextInt();
		int secondArrDimension = scan.nextInt();
		
		if(firstArrDimension != secondArrDimension){
			System.out.println(check);
		}else{
			int[] firstArray = new int[firstArrDimension];
			int[] secondArray = new int[secondArrDimension];
			
			for(int i1 = 0; i1 < firstArrDimension; i1++){
				System.out.printf("firstArray[%d] = ", i1);
				firstArray[i1] = scan.nextInt();
			}
			
			for(int i2 = 0; i2 < secondArrDimension; i2++){
				System.out.printf("secondArray[%d] = ", i2);
				secondArray[i2] = scan.nextInt();
			}
			
			for(int j = 0; j < firstArrDimension; j++){
				if(firstArray[j] == secondArray[j]){
					check = true;
				}else {
					check = false;
					break;
				}
			}
				
			System.out.println(check);
		}
		
		scan.close();
	}
}
