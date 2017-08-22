package chapter11;

import java.util.Random;

public class AdvertismentMessage {
//	�������� ��������, ����� �������� �������� �������� ��������� ��
//	������� �������. ����������� ������ �� �� ������� �� ������������
//	�����, �������� �� ������������ ������, �������� �� ����� (����� �
//	����� ���) � ����, ����� �� ������� �� ������������� ����������
//	�������. ��������, ���� ����� �������� �������:
//	- ������������ �����: {"��������� � �������.", "���� � ���������
//	�������.", "��������� ������� ���� �������.", "���� � ���-�������
//	������� �� ���� ���������."}.
//	- ������������ ������: {"���� �� �������� �����.", "����� �� ��
//	�������.", "��� ������� ����.", "�� ���� �� ��������, �� ���� ��
//	�������� ���������.", "�������� � ���. �� ��� ����� �������."}.
//	- ����� ��� �� �����: {"�����", "����", "�����", "�����", "����"}.
//	- ����� ��� �� �����: {"�������", "�������", "������"}.
//	- �������: {"�����", "�������", "�����", "����", "������"}.
//	������ �������� �� ����� �� ������ �������� ��������-����������
//	�������� ���������:
//	��������� ������� ���� �������. �������� � ���. �� ��� �������. -
//	� ����� �������, �����

	private static Random rand = new Random();
	
	private static String getPhrase(){
		String[] phrase = {"��������� � �������.", "���� � ��������� �������.", "��������� ������� ���� �������.", 
				"���� � ���-������� ������� �� ���� ���������."};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	
	private static String getEvent(){
		String[] phrase = {"���� �� �������� �����.", "����� �� �� �������.", "��� ������� ����.", 
				"�� ���� �� ��������, �� ���� �� �������� ���������.", "�������� � ���. �� ��� ����� �������."};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getFirstName(){
		String[] phrase = {"�����", "����", "�����", "�����", "����"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getLastName(){
		String[] phrase = {"�������", "�������", "������"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	private static String getCity(){
		String[] phrase = {"�����", "�������", "�����", "����", "������"};
		int count = rand.nextInt(phrase.length);
		return phrase[count];
	}
	public static void main(String[] args){
		System.out.printf("%s %s\n%s %s, %s", getPhrase(), getEvent(), getFirstName(), getLastName(), getCity());
	}
}
