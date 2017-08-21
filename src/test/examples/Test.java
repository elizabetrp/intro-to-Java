package test.examples;

import test.Cat;
import test.Sequence;

public class Test {
	static Cat myCat = new Cat("Pesho", "black");
	static Sequence seq = new Sequence();
	
//	����������� ���� �������� ����� chapter10 (� ������ � test) � ��������� � ���� �����
//	����� Cat � Sequence, ����� ����������� � ��������� �� �������� ����.
//	��������� ��� ���� �������� ����� � ��� chapter10.examples (test.examples) � � ����
//	��������� ����, ����� ������� ��������� Cat � Sequence.
	
	public static void main(String[] args){
		System.out.printf("My cat is called %s and is %s.\n", myCat.name, myCat.color);
		myCat.sayMiau();
		System.out.println();
		System.out.printf("%d %d %d %d", seq.nextValue(), seq.nextValue(), seq.nextValue(), seq.nextValue());
	}
}
