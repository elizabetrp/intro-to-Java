package chapter7;

import java.util.Scanner;

/**
 * Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
 */
public class EqualArrays {
	static boolean check = false;
	public static Scanner scan = new Scanner(System.in);
	
	//Extract this in method and reuse it below
    public static void fillArray(int dimension, String name, double[] array){
    	for (int i = 0; i < dimension; i++) {
            System.out.printf("%s[%d] = ", name, i);
            array[i] = scan.nextInt();
        }
    }
	
    private static void compareArrays(int dimension, double[] array1, double[] array2){
    	for (int i = 0; i < dimension; i++) {
            if (array1[i] == array2[i]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        //Some messages that you expect an input
        System.out.println("Enter size of first array: ");
        int firstArrDimension = scan.nextInt();
        System.out.println("Enter size of second array: ");
        int secondArrDimension = scan.nextInt();

        if(firstArrDimension == 0 && secondArrDimension == 0){
        	System.out.println("The arrays are empty!");
        	return;
        }else if(firstArrDimension != secondArrDimension){
            System.out.println(check);
            //You can break the execution of the program if you already know the final result.
            // In this way you will avoid multiple embedded cases and will make the code more clear
            // (with less indentations and brackets to follow)
            scan.close();
            return;
        }
        
        //Define new variables above the place you use them
        double[] firstArray = new double[firstArrDimension];
        double[] secondArray = new double[secondArrDimension];
        
        fillArray(firstArrDimension, "firstArray", firstArray);
        fillArray(secondArrDimension, "secondArray", secondArray);

        compareArrays(firstArrDimension, firstArray, secondArray);

        System.out.println(check);

        scan.close();
    }
}
