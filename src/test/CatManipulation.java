package test;

import test.Cat;
import test.Sequence;

public class CatManipulation {
	
//	�������� ��������, ����� ������� 10 ������ �� ��� Cat, ���� �� �����
//	�� ���� CatN, ������ N e �������� ������� ����� �� ������, � ������
//	������� ������ sayMiau() �� ����� �� ���. �� ������������ �����������
//	���� ����������� ����� chapter10 (test).
	
//	�� � ���������.
	
	public static void main(String[] args){
		Cat[] array = new Cat[10];
		for(int i = 0; i < 10; i++){
			array[i] = new Cat("Cat" + Sequence.nextValue(), "brown");
		}
		
		for (Object Cat : array){
			((test.Cat) Cat).sayMiau();
		}
	}
}
