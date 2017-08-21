package chapter123;

public class HelloJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		
		byte centuries = 20;
		short years = 2000;
		int days = 730480;
		long hours = 17531520;

		System.out.println(centuries + " centuries is " + years + " years, or " + days + " days, or " + hours + " hours.");
		
		float floatPi = 3.141592653589793238f;
		double doublePi = 3.141592653589793238;

		System.out.println("Float PI is " + floatPi + ", Double PI is " + doublePi + ".");
		
		float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		float num = 1.0f;
		boolean equal = (num == sum);
		
		System.out.println("num = " + num + " sum = " + sum + " equal = " + equal);
		
		int a = 1;
		int b = 2;
		
		boolean greaterAB = (a > b);
		boolean equalA1 = (a == 1);
		
		if (greaterAB) {
			System.out.println("A > B");
		} else {
			System.out.println("A <= B");
		}
		
		System.out.println("greaterAB = " + greaterAB);
		System.out.println("equalA1 = " + equalA1);
		
		char symbol = 'c';
		
		System.out.println(
		 "The code of '" + symbol + "' is: " + (int) symbol);
		
		symbol = 'b';
		
		System.out.println(
		 "The code of '" + symbol + "' is: " + (int) symbol);
		
		symbol = 'A';
		
		System.out.println(
		 "The code of '" + symbol + "' is: " + (int) symbol);
		
		float number = 1.25e+2f;
		System.out.println(number);
		
		char sym = '\u0065';
		System.out.println(sym);
		
		byte first = -115;
		byte second = 97;
		int third = 52130;
		short fourth = -10000;
		long fifth = 4825932;
		
		int i = 256;
		String hex = Integer.toHexString(i);
		System.out.println("Hex value is " + hex);
		
		boolean isMale = false;
		
		String hello = "Hello";
		String world = "World";
		
		Object obj = hello + ", " + world;
		System.out.println(obj);
		
		String str = (String) obj;
		System.out.println(str);
		
		String quote = "The \"use\" of quotations causes difficulties.";
		System.out.println(quote);
		
		String triangle = "\t\t*\n\t*\t\t*\n*\t\t*\t\t*";
		System.out.println(triangle);
		
		String heart = "\to\t\to\n\no\t\to\t\to\n\n\to\t\to\n\n\t\to";
		System.out.println("\n\n\n" + heart);
		
		//Create a class that contains information about employees.
		class Employee{
			String firstName;
			String lastName;
			byte age;
			char gender;
			int id;
			int uniqueNumber;			
		}
		
		int five = 5;
		int ten = 10;
		int copy = ten;
		ten = five;
		System.out.println(five + ", " + copy);
		
		int f = 5;
		System.out.println(f % 2 == 0 ? "even" : "odd");
		
		int num2 = 35;
		System.out.println(num2 % 5 == 0 && num2 % 7 == 0 ? true : false);
		
		int otherNum = 789;
		String digit = Integer.toString(otherNum);
		System.out.println(digit.charAt(digit.length() - 3) == '7' ? true : false);
		
		String newNum = Integer.toBinaryString(otherNum);
		System.out.println(newNum.charAt(newNum.length() - 3));			
		
		int diff = num2/f;
		System.out.println(diff);
	}
}

