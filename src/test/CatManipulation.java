package test;

import test.Cat;

public class CatManipulation {
	
//	�������� ��������, ����� ������� 10 ������ �� ��� Cat, ���� �� �����
//	�� ���� CatN, ������ N e �������� ������� ����� �� ������, � ������
//	������� ������ sayMiau() �� ����� �� ���. �� ������������ �����������
//	���� ����������� ����� chapter10 (test).
	
	public static void main(String[] args){
		for(int i = 1; i < 11; i++){
			Cat Cat = new Cat();
			Cat.name = "Cat" + i;
			Cat.sayMiau();
		}
	}
}
