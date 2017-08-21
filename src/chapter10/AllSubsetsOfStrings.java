package chapter10;

import java.util.Scanner;

public class AllSubsetsOfStrings {
	static String[] words, str;
	static int length;
	
	public static void printSingleSubsets(int iter, int index, int k){
        if (iter == k){
            for (int i = 0; i < length; i++){
            	if(str[i] != null){
            		System.out.printf("(%s)", str[i]);
            	}
            }
            return;
        }

        for (int i = index; i < words.length; i++){
            str[iter] = words[i];
            printSingleSubsets(iter + 1, i + 1, k);
        }
    }
	
//	Напишете програма, която отпечатва всички подмножества на дадено
//	множество от думи.
//	Примерен вход:
//	words = {'test', 'rock', 'fun'}
//	Примерен изход:
//	(), (test), (rock), (fun), (test rock), (test fun),
//	(rock fun), (test rock fun)

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter words length: ");
        length = scan.nextInt();

		scan.nextLine();

        words = new String[length];

        for(int i = 0; i < length; i++){
			System.out.printf("Enter %d element: ", i + 1);
			words[i] = scan.nextLine();
		}
        
        System.out.print("(), ");

        for (int i = 0; i <= length; i++){
            str = new String[length];
            printSingleSubsets(0, 0, i);
        }
        
        scan.close();
    }
}
