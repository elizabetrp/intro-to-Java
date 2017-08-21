package chapter123;

import java.util.Scanner;

public class HumanWeightOnMoon {
	static float percent;
	public static void main(String[] args) {
		float humanWeightOnEarth, humanWeightOnMoon;
		percent = 17/100f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight on Earth: ");
		humanWeightOnEarth = input.nextFloat();
		
		humanWeightOnMoon = humanWeightOnEarth * percent;
		
		System.out.println("Your weight on the Moon will be: " + humanWeightOnMoon + " kg");
		
		input.close();
	}
	
}
