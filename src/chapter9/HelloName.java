package chapter9;

public class HelloName {
	public static void name(String name){
		System.out.printf("Hello, %s!", name);
	}
	
//	�������� �����, ����� ��� �������� ��� ��������� � ��������� "Hello,
//	<name>!" (�������� "Hello, Peter!"). �������� ��������, ����� ������
//	���� �����.
	
	public static void main(String[] args){
		name("Peter");
	}
}
