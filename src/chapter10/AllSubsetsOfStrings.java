package chapter10;

import java.util.Scanner;


//	Напишете програма, която отпечатва всички подмножества на дадено
//	множество от думи.
//	Примерен вход:
//	words = {'test', 'rock', 'fun'}
//	Примерен изход:
//	(), (test), (rock), (fun), (test rock), (test fun),
//	(rock fun), (test rock fun)
public class AllSubsetsOfStrings {

    //Static variables should be used for constants.
    // Use instance variables when you want to engage something with the instance of the class
    static String[] words, str;
    static int length;

    public static void printSingleSubsets(int iter, int index, int k) {
        if (iter == k) {
            for (int i = 0; i < length; i++) {
                if (str[i] != null) {
                    System.out.printf("(%s)", str[i]);
                }
            }
            return;
        }

        for (int i = index; i < words.length; i++) {
            str[iter] = words[i];
            printSingleSubsets(iter + 1, i + 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Extract the read logic in methods
        //count not length
        System.out.println("Enter words length: ");
        length = scan.nextInt();

        scan.nextLine();

        words = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("Enter %d element: ", i + 1);
            words[i] = scan.nextLine();
        }

        System.out.print("(), ");

        for (int i = 0; i <= length; i++) {
            str = new String[length];
            printSingleSubsets(0, 0, i);
        }
//From this output I can hardly say the task is properly done
//        (), (one)(two)(three)(four)(five)(one)(two)(one)(three)(one)(four)(one)(five)(two)(three)(two)(four)(two)(five)(three)(four)(three)(five)(four)(five)(one)(two)(three)(one)(two)(four)(one)(two)(five)(one)(three)(four)(one)(three)(five)(one)(four)(five)(two)(three)(four)(two)(three)(five)(two)(four)(five)(three)(four)(five)(one)(two)(three)(four)(one)(two)(three)(five)(one)(two)(four)(five)(one)(three)(four)(five)(two)(three)(four)(five)(one)(two)(three)(four)(five)
        scan.close();
    }
}
