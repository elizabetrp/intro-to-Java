package chapter9;

import java.util.Scanner;

public class MaxNumber {
	public static int getMax(int a, int b){
		int max = a;
		if(b > a){
			max = b;
		}
		return max;
	}
	
	public static int maxOfThreeNumbers(int a, int b, int c){
		int temp = getMax(a, b);
		int result = getMax(temp, c);
		return result;
	}
	
//	�������� ����� getMax() � ��� ����������� (int) ����������, �����
//	����� ��-�������� �� ����� �����. �������� ��������, ����� �������
//	��� ���� ����� �� ��������� � ��������� ���-�������� �� ���, �����-
//	������ ������ getMax().

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		
		System.out.println("Enter third number: ");
		int c = scan.nextInt();
		
		System.out.println(maxOfThreeNumbers(a, b, c));
		
		scan.close();
	}
}
