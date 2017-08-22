package chapter9;

//	Напишете метод, който отпечатва цифрите на дадено десетично число
//	в обратен ред. Например 256, трябва да бъде отпечатано като 652.
public class BackwordsDigits {
    public static void convertDigits(int number) {

        if (number == 0) {
            System.out.println(number);
        }

        if (number < 0) {
            // you can use Math.abs
            number += 2 * (-number);
            System.out.print("-");
            //Extract this in method
            while (number > 0) {
                int digit = number % 10;
                System.out.print(digit);
                number /= 10;
            }
        }

        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        //Use variables not random strings/numbers. In this way the person who reads the code will know what this is
        int number = -965874854;
        convertDigits(number);
        System.out.println("\nWith Strings");
        flipNumber(number);
    }

    private static void flipNumber(int number) {
        String numberToString = "" + number;
        if (number < 0) {
            System.out.print("-");
        }
        for (int i = numberToString.length() - 1; i > 0; i--) {
            System.out.print(numberToString.charAt(i));
        }
    }
}
