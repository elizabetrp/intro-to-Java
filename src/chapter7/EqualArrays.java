//Check if two arrays are equal.
package chapter7;

import java.util.Scanner;

/**
 * Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
 */
public class EqualArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean check = false;

        //Some messages that you expect an input
        int firstArrDimension = scan.nextInt();
        int secondArrDimension = scan.nextInt();

        if (firstArrDimension != secondArrDimension) {
            System.out.println(check);
            //You can break the execution of the program if you already know the final result.
            // In this way you will avoid multiple embedded cases and will make the code more clear
            // (with less indentations and brackets to follow)
            scan.close();
            return;
        }

        //Define new variables above the place you use them
        int[] firstArray = new int[firstArrDimension];
        int[] secondArray = new int[secondArrDimension];

        //Extract this in method and reuse it below
        for (int i1 = 0; i1 < firstArrDimension; i1++) {
            System.out.printf("firstArray[%d] = ", i1);
            firstArray[i1] = scan.nextInt();
        }

        for (int i2 = 0; i2 < secondArrDimension; i2++) {
            System.out.printf("secondArray[%d] = ", i2);
            secondArray[i2] = scan.nextInt();
        }

        for (int j = 0; j < firstArrDimension; j++) {
            if (firstArray[j] == secondArray[j]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        System.out.println(check);


        scan.close();
    }
}
